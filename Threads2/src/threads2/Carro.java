package threads2;
public class Carro extends Thread  
{  
      
    private Podium campeao;  
    private String corredor;     
      
      
public Carro(String nome, Podium c)  
{  
    corredor = nome;  
    campeao = c;  
}  
     
    @Override  
public void run()  
{  
          
          
      try  
      {  
            int i;  
            for(i=1;i<66;i++)  
            {  
          
                System.out.println(i+"º.volta - Piloto "+ corredor);  
                int tempo = (int)(Math.random()*100);   //tempo de 1 milisegundo
                sleep(tempo);  
            }     
              
           this.campeao.setVencedor(corredor);        
      }    
      catch(Exception e)  
      {  
             e.printStackTrace();             
      }  
  }  
}  