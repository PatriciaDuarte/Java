package ex1apc2;
public class serHumano extends EmiteSom 
{
    public serHumano()
    {
        this.som = "AAAAAAAAAAAAAAAAAAAAAAAAAA";
    }
    @Override    
    public void emitirSom(){
        System.out.println("Som do humano:"+this.som);
    }
}
