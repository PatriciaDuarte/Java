package ex1apc2;

public class radio extends EmiteSom {
      public radio()
    {
        this.som = "Galopeeeeeiraaaa";
    }
    @Override    
    public void emitirSom(){
        System.out.println("Som do radio:"+this.som);
    }
    
}
