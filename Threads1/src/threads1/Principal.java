package threads1;
import java.util.Scanner;
public class Principal
{


    public static void main(String[] args)  
    {  
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha: 1. Cara \n 2.Coroa");
        String palpite = entrada.nextLine();
          
        Podium campeao = new Podium();  
        Carro cara = new Carro("Cara", campeao);  
        Carro coroa = new Carro("Coroa", campeao);  
                              
        cara.start();  
        coroa.start();  
            
        try  
        {  
            cara.join();  
            coroa.join();  
         }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
        if(campeao.getintercalação() == (palpite="1"))
        {
            System.out.println("Acertou");
        }else
            System.out.println("Errou.");
        
    } 
}
  