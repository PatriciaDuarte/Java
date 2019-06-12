//Autora: Patrícia Duarte da Silva(201514322)
package exercicios10;

import javax.swing.JOptionPane;

public class Conta 
{
  String nome;
  protected double saldo;
  //Construtor
    public Conta()
    {
        nome = "";
        saldo  = 0;
    }    
    
      public double getSaldo()
    {
      return saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
       
    public String getnome()
    {
         return nome;
    }
    
    public String getTipoConta()
    {
         return "";
    }
    
}