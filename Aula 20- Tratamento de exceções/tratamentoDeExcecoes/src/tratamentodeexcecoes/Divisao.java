//AUTORA: PATRICIA DUARTE DA SILVA
//AULA 20 - TRATAMENTO DE EXCEÇÕES
/* Observação: Pedi para entrar com valores inteiros porque a exceção não captura doubles, quando captura
o resultado dá infinito*/
package tratamentodeexcecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao 
{
    public static int calcula(int numerador,int denominador)
    throws ArithmeticException
     {
        return numerador/denominador; 
     }
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        boolean continueLoop = true; //determina se mais entradas são necessarias
        
        do{
           try
           {
               System.out.print("Entre com o numerador inteiro:");
               int numerador = entrada.nextInt();
               System.out.print("Entre com o denominador inteiro:");
               int denominador = entrada.nextInt();
               
               int resultado = calcula(numerador,denominador);
               System.out.printf("\nResultado %d / %d = %.5d \n",numerador,denominador,resultado);
               continueLoop=false;
           }
           catch( InputMismatchException e)
           {
               System.err.printf("\nExceção: %s \n ", e);
               entrada.nextLine();
               System.out.println("Você deve entrar com inteiros.Por favor tente novamente.");
           }
           catch(ArithmeticException e)
           {
           
             System.err.printf("\nExceção: %s \n ", e);
             System.out.println("Zero é um denominador inválido. Por favor tente novamente.");
           }
        
        }while(continueLoop);
    }
}
    
    

