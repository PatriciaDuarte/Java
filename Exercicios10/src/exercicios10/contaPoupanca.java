//Autora: Patrícia Duarte da Silva - 201514322
package exercicios10;

import javax.swing.JOptionPane;

public class contaPoupanca extends Conta
{
    
      public String getnome(String nome)
    {
       return nome;
    }
    
     public double getSaldo()
    {
      return saldo;
    }
        public String getTipoConta()
    {
        return "poupança";
    }
}
