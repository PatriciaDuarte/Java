package threads2;
public class Principal
{


    public static void main(String[] args)  
    {  
          
        Podium campeao = new Podium();  
        Carro carro1 = new Carro("Felipe Massa", campeao);  
        Carro carro2 = new Carro("Lewis Ramilton", campeao);  
                              
        carro1.start();  
        carro2.start();  
            
        try  
        {  
            carro1.join();  
            carro2.join();  
         }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
        System.out.println("Fim da prova.");  
        System.out.println("o vencedor é: "+ campeao.getVencedor());  
    } 
}
  