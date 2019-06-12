package pacote;
//autora: Patrícia Duarte da Silva - 201514322
import java.util.Scanner;

public class Menu
{
    //Entrada principal
    public int menu()
    {
           int opcao;
           
           Scanner input = new Scanner(System.in);
           System.out.println("1. Aluno");
           System.out.println("2. Professor");
           System.out.println("3. Tecnico");
           System.out.println("4. Disciplina");
           System.out.println("5. Curso");
           System.out.println("9. Fechar programa.");
           Scanner s = new Scanner(System.in);
           opcao = input.nextInt();
           return opcao;
    }
    
    public int aluno()
    {
            int opcao;
            
            Scanner input = new Scanner(System.in);
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("9. Fechar programa.");
            Scanner s = new Scanner(System.in);
            opcao = input.nextInt();
            return opcao;
        }
    public int professor()
    {  
            int opcao;
            
            Scanner input=new Scanner(System.in);
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Listar Professores");
            System.out.println("3. Buscar Professor");
            System.out.println("4. Excluir Professor");
            System.out.println("9. Fechar programa.");
            Scanner s = new Scanner(System.in);
            opcao = input.nextInt();
            return opcao;
        }
    public int tecnico()
    {    
            int opcao;
            
            Scanner input = new Scanner(System.in);
            System.out.println("1. Cadastrar Tecnico");
            System.out.println("2. Listar Tecnicos");
            System.out.println("3. Buscar Tecnico");
            System.out.println("4. Excluir Tecnico");
            System.out.println("9. Fechar programa.");
            Scanner s = new Scanner(System.in);
            opcao = input.nextInt();
            return opcao;

    }
    public int disciplina()
    {
           int opcao;
           
           Scanner input=new Scanner(System.in);
           System.out.println("1. Cadastrar Disciplinas");
           System.out.println("2. Listar Disciplinas");
           System.out.println("3. Buscar Disciplina");
           System.out.println("4. Excluir Disciplina");
           System.out.println("9. Fechar programa.");
           Scanner s = new Scanner(System.in);
           opcao = input.nextInt();
           return opcao;
    }
    public int curso()
    {
           int opcao;
           
           Scanner input=new Scanner(System.in);
           System.out.println("1. Cadastrar Cursos");
           System.out.println("2. Listar Cursos");
           System.out.println("3. Buscar Curso");
           System.out.println("4. Excluir Curso");
           System.out.println("9. Fechar programa.");
           Scanner s = new Scanner(System.in);
           opcao = input.nextInt();
           return opcao;
    }
   
    
 
}
