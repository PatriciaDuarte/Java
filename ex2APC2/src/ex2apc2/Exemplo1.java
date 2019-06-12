package ex2apc2;
public class Exemplo1 {
 public static void main(String[] args)
 {
    Xpto x1=new Xpto();
Xpto x2= new Xpto(5,6,7);
x1.seta(1);
x1.setb(2); System.out.println(x1.soma());
System.out.println(x2.soma());
x1.setc(x2.geta());
x2.seta(x2.geta()+1);
System.out.println(x1.getc());
System.out.println(x2.geta());
};
};   

