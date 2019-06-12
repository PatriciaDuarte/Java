/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

public class DiscoOptico extends Dispositivo
{
    DiscoOptico(int n,long c)
    {   
        super("Disco Ótico",241172480L);    
    }
    public String toString()
    {
        return "Dispositivo:"+nome;
    }

    @Override
    public double capacidadeEmMegabytes() {
      return capacidadeEmBytes;
    }
}
