//AUTORA: PATRICIA DUARTE DA SILVA
//AULA 20 - TRATAMENTO DE EXCEÇÕES
package tratamentodeexcecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao 
{
    public static double calcula(double numerador,double denominador)
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
               System.out.print("Entre com o numerador double:");
               double numerador = entrada.nextDouble();
               System.out.print("Entre com o denominador double:");
               double denominador = entrada.nextDouble();
               
               double resultado = calcula(numerador,denominador);
               System.out.printf("\nResultado %f / %f = %.5f \n",numerador,denominador,resultado);
               continueLoop=false;
           }
           catch( InputMismatchException e)
           {
               System.err.printf("\nExceção: %s \n ", e);
               entrada.nextLine();
               System.out.println("Você deve entrar com doubles.Por favor tente novamente.");
           }
           catch(ArithmeticException e)
           {
           
             System.err.printf("\nExceção: %s \n ", e);
             System.out.println("Zero é um denominador inválido. Por favor tente novamente.");
           }
        
        }while(continueLoop);
    }
}
    
    

