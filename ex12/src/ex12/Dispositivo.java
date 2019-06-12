package ex12;
public abstract class Dispositivo
{
    public String nome;
    public  long capacidadeEmBytes;

    Dispositivo(String n,long c)
    {
        nome = n; capacidadeEmBytes = c;
    }
    
    public abstract String toString();
    public abstract double capacidadeEmMegabytes();
}
