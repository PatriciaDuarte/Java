//Autora: Patrícia Duarte da Silva - 201514322
package exercicios10;
import javax.swing.JOptionPane;
public class ControleBanco
{
    public static void main(String args[])
    {
       
      String opcaoString = JOptionPane.showInputDialog("Entre com uma das 2 opções:\n\n 1 - Criar uma conta corrente.\n 2 - Criar uma conta poupança.");
      int opcaoInt = Integer.parseInt(opcaoString);
       switch(opcaoInt)
       {
           case 1:
           {
               contaCorrente objeto1 = new contaCorrente();
                JOptionPane.showInputDialog("Digite o nome do cliente titular da conta: ", objeto1.getnome());
            
                JOptionPane.showMessageDialog(null," Conta " +objeto1.getTipoConta() + " criada com sucesso!!!");
                
                break;
           }
           case 2:
           {
               contaPoupanca objeto2 = new contaPoupanca();
           
               JOptionPane.showMessageDialog(null," Conta " +objeto2.getTipoConta() + " criada com sucesso!!!");
               break;
           }
           default :
           {
             JOptionPane.showMessageDialog(null, "ERRO","ERRO", JOptionPane.ERROR_MESSAGE);
             break;
           }   
       }
       //||| PARTE DO EXERCICIO
       
        String opcaoString2 = JOptionPane.showInputDialog("Entre com uma das 3 opções:\n\n 1 - Depositar.\n 2 - Ver o saldo. \n 3 - Sair");
        int opcaoInt2 = Integer.parseInt(opcaoString2);
       switch(opcaoInt2)
       {
           case 1:
           {
              String deposito = JOptionPane.showInputDialog("Valor do depósito:");
              contaCorrente objeto = new contaCorrente();
              JOptionPane.showMessageDialog(null," Saldo na conta de "+ objeto.getnome()+ ": " +objeto.getSaldo());
               break;
           }
           case 2:
           {
               contaPoupanca objeto2 = new contaPoupanca();
               objeto2.getnome();
               JOptionPane.showMessageDialog(null," Conta " +objeto2.getTipoConta() + " criada com sucesso!!!");
               break;
           }
             case 3:
           {
               JOptionPane.showConfirmDialog(null, "Obrigado por usar nosso sistema!!!");
           }
           default :
           {
             JOptionPane.showMessageDialog(null, "ERRO","ERRO", JOptionPane.ERROR_MESSAGE);
             break;
           }      
       }       
     
       
    }
}
