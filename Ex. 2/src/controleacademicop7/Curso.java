package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Curso
{
    private String nome;
    private int cod;
    private int duracao;
    private static int k;
    private static Curso c=new Curso();
    private static ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    public static void adicionar(Curso c)
    {
        cursos.add(c);
        System.out.printf("Total de cursos inseridos:%d\n",cursos.size());
    }
    public static void listar()
    {
        for(Curso c:cursos)
            c.mostrardados();
    }
    public static Curso buscarCurso(int cod_curso)
    {
        for(Curso objeto:cursos)
        {
            if(objeto.getCod()==cod_curso)
            {
                System.out.println("Curso encontrado!");
                return objeto;
            }
        }
        return null;
    }
    public static boolean excluir(int cod_curso)
    {
        for(k=0;k<cursos.size();k++)
        {
            c=cursos.get(k);
            if(c.getCod()==cod_curso)
            {
                cursos.remove(k);
                System.out.println("Curso removido");
                return true;
            }
        }
        return false;
    }
    public boolean setNome(String nome)
    {
        if (nome.length() > 0) 
        {
            this.nome = nome;
            return true;
        }
        else
        {
            System.out.println("Nome de curso invalido!");
            return false;
        }
    }
    public boolean setCod(int cod)
    {
        if (cod > 0)
        {
            this.cod = cod;
            return true;
        }
        else
        {
            System.out.println("Codigo invalido!");
            return false;
        }
    }
    public boolean setDuracao(int duracao)
    {
        if (duracao > 0)
        {
            this.duracao = duracao;
            return true;
        }
        else
        {
            System.out.println("Duracao invalida!");
            return false;
        }
    }
    void lerDados()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do curso: ");
            while (!setNome(s.nextLine()));
       try
       {
            System.out.println("Digite a duracao do curso: ");
            while (!setDuracao(s.nextInt()));
       }catch(InputMismatchException e)
        {
             System.err.printf("\nExceção: %s \n ", e);
             System.out.println("Você deve entrar com duração inteira.Por favor tente novamente.");
        }      
         try
         {   
             System.out.println("Digite o codigo do curso: ");
              while (!setCod(s.nextInt()));
        }catch(InputMismatchException e)
        {
            System.err.printf("\nExceção: %s \n ", e);
            System.out.println("Você deve entrar com código inteiro.Por favor tente novamente.");
        }
    }
    void mostrardados()
    {
        System.out.println("Nome do curso: "+this.nome);
        System.out.println("Duracao do curso: "+this.duracao);
        System.out.println("Codigo do curso: "+this.cod);
    }
    public int getCod()
    {
        return this.cod;
    }
}
