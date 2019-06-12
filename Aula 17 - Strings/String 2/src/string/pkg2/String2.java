/*Escreva um programa que dado um valor numérico digitado pelo usuário(armazenado em uma variável inteira),
imprima cada um dos seus dígitos por extenso. Exemplo:Entre o número:4571
Resultado:quatro,cinco,sete,um*/

//Autora: PATRÍCIA DUARTE DA SILVA  - 201514322
package string.pkg2;
import java.util.Scanner; 
public class String2
{

        public static void main(String[] args)
        {
         
          char[] numbers = "0123456789".toCharArray();
          Scanner entrada = new Scanner(System.in);
        
         System.out.println("Digite um número inteiro:");
         String numeroUser= entrada.nextLine();
         char[]arr = numeroUser.toLowerCase().toCharArray();
         System.out.println("\n Numeros por extenso: \n\n");
         for(int i=0; i<arr.length;i++)
         switch (arr[i]) 
         {
              case '0':
                         System.out.println ("Zero"); 
                         break;
              case '1':
                         System.out.println ("Um"); 
                         break;
                 case '2':
                         System.out.println ("dois"); 
                         break;
                case '3':
                         System.out.println ("Três"); 
                         break;
                case '4':
                         System.out.println ("Quatro"); 
                         break;
                 case '5':
                         System.out.println ("Cinco"); 
                         break;
                 case '6':
                         System.out.println ("Seis"); 
                         break;
                 case '7':
                         System.out.println ("Sete"); 
                         break;
                 case '8':
                         System.out.println ("Oito"); 
                         break;
                  case '9':
                         System.out.println ("Nove"); 
                         break;
           }
        }
    
}
