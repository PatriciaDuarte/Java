package pacote;
//Autora: Patrícia Duarte da SIlva - 201514322
import java.util.Scanner;
public class Curso
{
   private String nome;
   private int codigo;
   private int duracao;
   
   public boolean setNome(String nome)
   {
       if(nome.length()>0)
       {
           this.nome = nome;
           return true;
       }
       else
       {
        System.out.println("Nome inválido!");
        return false;
       }
   }
      public int getCodigo()
    {
        return this.codigo;
    }
   
   public boolean setCodigo(int codigo)
   {
       if(codigo >  0)
       {
           this.codigo = codigo;
           return true;
       }else
       
           System.out.println("Código inválido!"); return false;
        
   }
   
   public boolean setDuracao(int duracao)
   {
       if(duracao > 0)
       {
           this.duracao = duracao;
           return true;
        }else
        {
            System.out.println("Duração inválida!");
            return false;
        }
   }
   
   
   public void lerDados()
    {
         Scanner s = new Scanner(System.in);
         
           
        System.out.println("Digite o nome do curso:");
        while (!setNome(s.nextLine()));
         
         System.out.println("Digite o codigo do curso:");
         while (!setCodigo(s.nextInt()));
         
         System.out.println("Digite a duração do curso");
         while (!setDuracao(s.nextInt())); 
    }
    
        public void mostrarDados() 
    {
        System.out.println("Nome do curso: "+this.nome);
        System.out.println("Código do curso: "+this.codigo);
        System.out.println("Duração do curso: "+this.duracao);
    }
  
   
}

   

