package ex2apc2;
public class Xpto 
{
//VARIAVEIS DE INSTANCIA
    private int a;
    private int b;
    private int c;

//CONSTRUTOR 
    public Xpto()
    {
        a = 0;
        b=0;
        c=0;
    }
     public Xpto (int a, int b, int c) 
    {
        seta(a);
        setb(b);
        setc(c);
    }
    
    public int geta()
    {
        return a;
    }
    
    public void seta(int a)
    {
        this.a = a;
    }
    
    public int getb()
    {
        return b;
    }
    
    public void setb(int b)
    {
        this.b = b;
    }
    
    public int getc()
    {
        return c;
    }
    
    public void setc(int c)
    {
        this.c = c;
    }
   

//METODOS
    public int produto()
    {
        return (a*b*c);
    }

    public int soma()
    {
        return (a+b+c);
    } 
}