
package threads.pkg3;
public class Correntista extends Thread  
{  
  
    private ContaCorrente conta[];  
    private boolean entrar = true;  
  
    public Correntista(ContaCorrente conta[])   
    {  
         
        this.conta = conta;  
    }  
  
    public void run()  
    {  
         
        try  
        {  
              
            while(entrar)  
            {  
               int total = 0;  
              int a = (int)(Math.random()*2);  
              int b = (int)(Math.random()*2);    
              
              synchronized (conta)
              {
                conta[b].sacar(3000);    
                conta[a].depositar(3000);  
              }
                  
                sleep(1000);  
                 System.out.println("\nSaldo da conta: "+conta[a].getContaCorrente()+": "+ conta[a].getSaldo());  
                System.out.println("\nSaldo da conta: "+conta[b].getContaCorrente()+": "+ conta[b].getSaldo());  
                  
                synchronized (conta)
            {
                 for(int i = 0; i < conta.length;i+=1)  
                 {                   
                        total += conta[i].getSaldo();  
                 }      
                  
                System.out.println("\nSaldo no banco: "+total);  
            } 
          }
        }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
                  
    }  
      
}  
  
      
