/* Crie um programa em que o usuário digite uma palavra com pelo menos 8 caracteres, (contendo letras
e números) e a seguir: – forme uma nova palavra usando as duas primeiras e as duas úl5mas letras.
– Verifique se a string contém numeros – Subs5tua os números por “*”
*/
//AUTORA: PATRICIA DUARTE DA SILVA - 201514322
package string.pkg4.aula.pkg18;
import java.util.Scanner;

public class Ex4 
{
    
    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner(System.in);
       
        
        System.out.println("Digite uma palavra de pelo menos 8 caracteres,contendo letras e números:");
	String palavra = entrada.nextLine();
        if(palavra.length()>=8)
        {
            System.out.println("\nFormando uma palavra com as duas primeiras letras...");
            System.out.println(palavra.substring(0,2)+" PALAVRA QUALQUER");
            System.out.println("\nFormando uma palavra com as duas últimas letras..");
            System.out.println("PALAVRA QUALQUER "+palavra.substring(palavra.length() - 2));

           System.out.println("Verificando se essa String contém números...");
           char[]c = palavra.toCharArray();
           for(int i=0;i<c.length;i++)
           {
                 if(Character.isDigit(c[i]))
                    {             
                      System.out.print(c[i]);
                    }
            }
           System.out.println("\n");
           System.out.println("Mudando os valores das Strins por '*'");
           String comoFicou = palavra.replaceAll("[0123456789]","*");
           System.out.println(comoFicou);
        }else
        System.out.println("Rode o código novamente, e digite uma palavra de pelo menos 8 caracteres, contendo letras e números.");
        
        
     }
        
        
}


