package string.pkg5.aula.pkg18;
//AUTORA: PATRICIA DUARTE DA SILVA 201514322
public class Anagrama 
{
   String palavra1;
   
   public  Anagrama (String palavra1)
   {
      this.palavra1=palavra1;
   }
   
   boolean resolvaProblemaA (String palavra2) 
   {
      boolean sair=false;
      int i=0;
      while (i<palavra1.length() & sair==false)
       {
              char aux=palavra1.charAt(i);
              int c1=0;
              if (palavra1.length()!=palavra2.length())
              {
                sair=true;
              }
             for (int j=0;j<palavra1.length();j++)
             {
                if (palavra1.charAt(j)==aux)
                c1++;
             }
            int c2=0;
            
             for (int j=0;j<palavra2.length();j++)
             {
                 if (palavra2.charAt(j)==aux)
                 c2++;
             }
             if (c1!=c2)
                sair=true;
                i++;   
        }
    return sair;            
   }
                        
      //MAIN DO CÓDIGO
   public static void main(String[]args) 
   {
       //EXEMPLO DO EXERCICIO DADO, QUE IRACEMA ERA ANAGRAMA DE AMERICA
      Anagrama obj = new Anagrama ("iracema"); //ANAGRAMA 1
      boolean sair=obj.resolvaProblemaA ("america");//ANAGRAMA 2
      if (sair==true)
         System.out.println("a palavra nao e anagrama");
      else
         System.out.println("a palavra e anagrama");
      
   } 
}