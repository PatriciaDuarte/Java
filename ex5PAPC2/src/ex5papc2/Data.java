package ex5papc2;
public class Data
{
    private int dia;
    private int mes;
    private int ano;
   private Data date;
   
    public Data()
    {
       
        
    }

   public Data(int dia,int mes,int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        date = new Data();
        date.setDia();
        date.setMes();
        date.setAno();
        date.toString();
    }
   public int getDia()
    {
        return dia;
    }
  public void setDia()
  {
      if((dia<0) && (dia>= 31))
      {
          System.out.println("Data inválida. Dia não está no intervalo [1,31]");
      } else
      {   System.out.println("Data válida.");}
  }
   
    
    public int getMes()
    {
        return mes;
    }
    
    public void setMes()
    {
        if((mes < 0)&&(mes>=12)){
            System.out.println("Data invalida! MêS não esta no intervalo entre [0 e 12]");}
        else {
            System.out.println("Data válida!");}
    }
    
    
    public int getAno()
    {
        return ano;
    }
    
    public void setAno()
    {
        if(ano < 0)
        {
            System.out.println("Data inválida!Ano não é um inteiro positivo.");
        }else
        {   System.out.println("Data válida!");}
    }
    
}