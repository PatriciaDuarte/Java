//Autora: Patrícia Duarte da Silva-201514322
package exercicios10;
import javax.swing.JOptionPane;
public class contaCorrente extends Conta
{
    
       public void impressaoConta()
    {
         JOptionPane.showMessageDialog(null," Conta corrente criada com sucesso!!!");
    }
    
     public String getnome()
    {
      return  nome ;
    }
        
      public double getSaldo()
    {
      return saldo;
    }
     public String getTipoConta()
    {
        return "corrente";
    }
     
     public void depositar(double auxiliar, double deposito)
     {
         String converte= JOptionPane.showInputDialog("Digite o valor do depósito: ");
         deposito = Integer.parseInt(converte);
        auxiliar = (int) (deposito + getSaldo());
        
     }   
}
