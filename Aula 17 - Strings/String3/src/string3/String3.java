//Autora: PATRÍCIA DUARTE DA SILVA  - 201514322
package string3;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;
public class String3 {

   
    public static void main(String[] args)
    {
      	List<Character> iniciais = new ArrayList<>();
         Scanner entrada = new Scanner(System.in);
         System.out.println("Digite um nome completo:\n Detalhe: Segundo o dicionário da lingua portuguesa, início de nome começa com letra maiúscula.\n");
         String nome= entrada.nextLine();
         
         char[]arr = nome.toLowerCase().toCharArray();
         
         System.out.println("\n Iniciais do nome: \n\n");
        for (char letra : nome.toCharArray()) 
        {
             if (Character.isUpperCase(letra))
             {
                iniciais.add(letra);
             }
        }
           System.out.println(iniciais.toString());
        
        
    
    
    }
    
}
