package teste;
import java.util.InputMismatchException;
public class Lista
{
    // variaveis de instancia
    private int[] valores;
    // construtores
    public Lista() 
    {
        valores = new int[5];
    }
    
    public Lista(int x)
    {
        valores = new int[x];
    }

    // metodos de instancia
    public void insere(int index, int valor)
    {
        try
        {
        valores[index] = valor;
        }catch(ArrayIndexOutOfBoundsException e)
        {
         System.err.printf("\nExceção: %s \n ", e);
         System.out.println("Você deve entrar com indices menor ou igual a 9.Por favor tente novamente.");
        }
        finally 
        {
            System.out.println("Saindo do método insere.");
        }
    }
    
    public void insere(int index, int valor1, int valor2)
    {
        try
        {
         int y = valor1 / valor2;
         valores[index] = y;
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.printf("\nExceção: %s \n", e);
            System.out.println("Você deve entrar com indices menor ou igual a 9. Por favor tente novamente.");
        }
        catch(ArithmeticException e)
           {
           
             System.err.printf("\nExceção: %s \n ", e);
             System.out.println("Zero é um denominador inválido. Por favor tente novamente.");
           }
        finally
        {
            System.out.println("Saindo do método insere.");
        }
    }
    
    public void verValores()
    {
        System.out.print("Valores:");
        for(int i = 0; i < valores.length; i++)
        {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
    }

}