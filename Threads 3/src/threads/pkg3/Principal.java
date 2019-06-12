package threads.pkg3;

public class Principal 
{
    
    public static void main(String[] args) {  
       
        ContaCorrente[] contas = new ContaCorrente[10];  
            
        contas[0]= new ContaCorrente(1025);  
        contas[1]= new ContaCorrente(1032);  
        contas[2]= new ContaCorrente(1030);  
        contas[3]= new ContaCorrente(1035);  
        contas[4]= new ContaCorrente(1133);  
        contas[5]= new ContaCorrente(102);  
        contas[6]= new ContaCorrente(1039);  
        contas[7]= new ContaCorrente(1065);  
        contas[8]= new ContaCorrente(1010);  
        contas[9]= new ContaCorrente(1019);  
          
        double total = 0;  
        for(int i = 0; i < contas.length;i+=1)  
        {  
            contas[i].setSaldo(10000);  
            total += contas[i].getSaldo();  
        }      
          
        Correntista[] cliente = new Correntista[5];  
          
        for(int i = 0; i < cliente.length;i+=1)  
        {  
            cliente[i] = new Correntista(contas);            
        }      
     
        for(int i = 0; i<5; i++)  
        {  
            cliente[i].start();  
        }  
          
                   
            try  
            {  
                for(int i = 0; i<5; i++)  
                 {  
                    cliente[i].join();  
                 }                       
            }  
            catch(Exception e)  
            {  
                e.printStackTrace();  
            }  
    }  
          
}  

          

 
        
    
    
