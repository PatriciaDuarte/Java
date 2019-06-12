package pacote;
///Autora: Patrícia Duarte da SIlva - 201514322
import java.util.Scanner; 
public class Disciplina
{
    private String nome;
    private int codigo;
    private int cargaHoraria;
    private Curso curso = new Curso();
    private Professor professor = new Professor();
   
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
       if(codigo>0)
       {
           this.codigo = codigo;
           return true;
       }
       else
       {
        System.out.println("Código inválido!");
        return false;
       }
   }
    
        public boolean setcargaHoraria(int cargaHoraria)
   {
       if(cargaHoraria>0)
       {
           this.cargaHoraria = cargaHoraria;
           return true;
       }
       else
       {
        System.out.println("Carga horária inválida!");
        return false;
       }
   }
        public boolean setCurso(Curso curso)
    {
         this.curso  = curso;
         return true;
    }
        public boolean setProfessor(Professor professor)
    {
         this.professor  = professor;
          return true;
    }
    
    
    public void lerDados()
    {
         Scanner s = new Scanner(System.in);
         System.out.println("Digite o nome da disciplina:");
         while (!setNome(s.nextLine()));
         
         System.out.println("Digite o codigo:");
         while (!setCodigo(s.nextInt()));
         
         System.out.println("Digite a carga horaria da disciplina:");
        while (!setcargaHoraria(s.nextInt()));
         
         curso = new Curso();
         curso.lerDados();
         
         professor = new Professor();
         professor.lerDados();
    }
    
    public void mostrarDados()
    {
        System.out.println("Nome: "+this.nome);
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Carga Horária: "+this.cargaHoraria);
        curso.mostrarDados();
        professor.mostrarDados();
    }
}

    
