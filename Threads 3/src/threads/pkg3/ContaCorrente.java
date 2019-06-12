
package threads.pkg3;
public class ContaCorrente  
{  
    private int contaCorrente;  
    private double saldo;  
      
  
    public ContaCorrente(int contaCorrente)  
    {  
        this.contaCorrente = contaCorrente;  
    }  
  
    public void setSaldo(double saldo)  
    {  
        this.saldo = saldo;  
    }  
      
    public int getContaCorrente()  
    {  
        return contaCorrente;  
    }  
  
    public double getSaldo()  
    {  
        return saldo;  
    }  
      
   public void sacar(double valor)  
   {  
       if(saldo > valor)  
       {  
           this.saldo = saldo - valor;  
       }  
       else  
       {  
           System.out.println("Saldo Insuficiente"); // mensagem para o usuario  
       }  
   }  
     
   public void depositar(double valor)  
   {  
       if(valor > 0)  
       {  
           this.saldo = saldo + valor;  
       }  
       else  
       {  
           System.out.print("valor invalido"); // mensagem para o usuario  
       }  
   }  
}  
      
