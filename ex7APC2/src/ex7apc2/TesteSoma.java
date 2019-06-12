package ex7apc2;
public class TesteSoma
{
    public static void main(String[] args)
    {
        Soma soma = new Soma(); // cria instância da classe Soma byte b =
        byte b = 20;
        short s = 99;
        int i= 1000; 
        long l =1234L;
        float f = 3.1416f;
        double d = 2000;
        
// Chama vários métodos da classe Soma
System.out.println(soma.doisValores(b,s));
System.out.println(soma.doisValores(i,s));
System.out.println(soma.doisValores(i,i));
System.out.println(soma.doisValores(l,b));
System.out.println(soma.doisValores(f,s));
System.out.println(soma.doisValores(d,b));
System.out.println(soma.doisValores(b,d));
System.out.println(soma.doisValores(i,l));
System.out.println(soma.doisValores(l,l));
System.out.println(soma.doisValores(d,f));
}
}