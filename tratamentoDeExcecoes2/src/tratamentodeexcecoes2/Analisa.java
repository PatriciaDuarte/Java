//Autora: Patrícia Duarte da Silva - 201514322
package tratamentodeexcecoes2;
import java.util.Scanner;
public class Analisa
{
    public String analisaSequencia()
    {
        String valida= null;
        int flag = 0;
                
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite uma sequencia");
        String   sequencia = entrada.nextLine();
        if(sequencia.length()>8)
        {
            char[]vetor = sequencia.toCharArray();
            for(int i=0;i<vetor.length;i++)
            {
                if(Character.isDigit(vetor[i]))
                 {   
                     flag = -1;
                 }
            }
                 if((flag==0)&&(sequencia.length()>8))
                 {
                    valida = sequencia;
                 }
        }
    return valida;
    }
    public static void main(String[] args) throws NullPointerException
    {
        Analisa objeto =new Analisa();
        String string=null;
        try
        {
            string=objeto.analisaSequencia().toUpperCase();
        }
        catch(NullPointerException e)
        {
            System.out.println("A frase está  nula.");
        }
        finally
        {
            if(string==null)
            {
                objeto.analisaSequencia();
            }
        }
    }
}
    
    

