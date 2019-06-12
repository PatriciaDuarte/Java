package threads1;
import java.util.Scanner;

public class Carro extends Thread  
{  
      
    private Podium fimConcorrencia;  
    private String corredor;     
      
      
public Carro(String nome, Podium c)  
{  
    corredor = nome;  
    fimConcorrencia = c;  
}  
     
    @Override  
public void run()  
{  
          Scanner entrada = new Scanner(System.in);
          System.out.println("Entre com 1 para parar a thread:");
          String parada = entrada.nextLine();
          
      try  
      {  
            int i;  
            while(parada  == "1")  
            {  
          
                System.out.println("Moeda:  "+ corredor);  
                int tempo = (int)(Math.random()*100);   //tempo de 1 milisegundo
                sleep(tempo);  
            }     
              
           this.fimConcorrencia.setintercalação(corredor);        
      }    
      catch(Exception e)  
      {  
             e.printStackTrace();             
      }  
  }  
}  