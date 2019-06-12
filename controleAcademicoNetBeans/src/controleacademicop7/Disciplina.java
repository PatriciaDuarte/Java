package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.ArrayList;
public class Disciplina
{
    static private String nome;
    static private int cod;
    static private int carga;
    static private int k;
    Curso c=new Curso();
    Professor professor=new Professor();
    private static Disciplina d = new Disciplina();
    private static ArrayList<Disciplina> Disciplinas = new ArrayList<Disciplina>();
    
    public static void adicionar(Disciplina d)
    {
        Disciplinas.add(d); //Cadastrar disciplina
        System.out.printf("Total de disciplinas inseridos:%d\n",Disciplinas.size());
    }
    public static void listar()
    {
        for(Disciplina objeto:Disciplinas) //Listar Disciplina
            objeto.mostrardados();
    }
    public static Disciplina buscar(int coddisciplina)
    {
        for(Disciplina objeto:Disciplinas)
        {
            if(objeto.getCod()==coddisciplina)
            {
                System.out.println("Disciplina encontrada!");
                return objeto;
            }
        }
        return null;
    }
    public static boolean excluir(int coddisciplina)
    {
       for(k=0;k<Disciplinas.size();k++)
       {
           d=Disciplinas.get(k);
           if(d.getCod()==coddisciplina)
           {
               Disciplinas.remove(k);
               System.out.println("Disciplina removida!");
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
            System.out.println("Nome invalido!");
            return false;
        }
    }
    public boolean setCarga(int carga)
    {
        if(carga > 0)
        {
            this.carga = carga;
            return true;
        }
        else
        {
            System.out.println("Carga horaria invalida!");
            return false;
        }
    }
    public boolean setCod(int cod)
    {
        if(cod > 0) 
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
    void lerDados()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome da disciplina: ");
            while (!setNome(s.nextLine()));
        System.out.printf("Digite o codigo da disciplina: ");
            while (!setCod(s.nextInt()));
        System.out.printf("Digite a carga horaria da disciplina: ");
            while (!setCarga(s.nextInt()));
    }
    public void mostrardados()
    {
        System.out.println("Nome da disciplina: "+this.nome);
        System.out.println("Codigo da disciplina: "+this.cod);
        c.mostrardados();
        professor.mostrardados();
    }
    public int getCod()
    {
        return this.cod;
    }
}
