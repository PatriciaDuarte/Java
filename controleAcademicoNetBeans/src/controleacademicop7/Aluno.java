
package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.ArrayList;

public class Aluno
{
    private String nome;
    private String matricula;
    private static String cpf;
    private static Disciplina d = new Disciplina();
    private static Aluno a = new Aluno();
    private static Curso curso = new Curso();
    private static int i;
    private int j;
    private int cod;
    byte situacao;
    String escolhido;
    private static int cod_curso;
    
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public static void adicionar(Aluno a)
    {
        alunos.add(a);
        System.out.printf("Total de alunos inseridos:%d\n",alunos.size());
    }
    
    public static void listar()
    {
        for(Aluno a: alunos)
            a.mostrarDados();
    }
    public static void buscar(String matricula)
    {
        for(Aluno a:alunos)
        {
            if(a.getMatricula().equals(matricula))
            {
                System.out.println("Aluno encontrado!");
                a.mostrarDados();
            }
        }
    }
    
    public static boolean excluir(String matricula)
    {
        for(i=0;i<alunos.size();i++)
        {
            a=alunos.get(i);
            if(a.getMatricula().equals(matricula))
            {
                alunos.remove(i);
                System.out.println("Aluno removido");
                return true;
            }
        }
        return false;
    }
    public void inserirCurso()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com o codigo do curso:");
        cod_curso=s.nextInt();
        this.curso = Curso.buscarCurso(cod_curso);
        if (this.curso == null)
            System.out.println("Curso não existe na base de dados.");
            else
            System.out.println("Curso encontrado com sucesso.");
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
    public boolean setMatricula(String matricula)
    {
        if (matricula.length() > 0)
        {
            this.matricula = matricula;
            return true;
        }
        else 
        {
            System.out.println("Numero de matricula invalido!");
            return false;
        }
    }
    public boolean setCPF(String cpf)
    {
        if (cpf.length() > 0)
        {
            this.cpf = cpf;
            return true;
        }
        else 
        {
            System.out.println("CPF invalido!");
            return false;
        }
    }
    public byte conversao(String escolhido)
    {
        switch(escolhido)
        {
            case "M":
                return 1;
            case "T":
                return 2;
            case "D":
                return 3;
            default:
                System.out.println("Situação digitada incorreta!");
        }
        return 0;
    }
    public void lerdados()
    {
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite o nome do aluno: ");
        while (!setNome(s.nextLine()));
        System.out.printf("Digite a matricula do aluno: ");
        while (!setMatricula(s.nextLine()));
        System.out.printf("Digite o cpf do aluno: ");
        while (!setCPF(s.nextLine()));
        System.out.printf("Digite a letra correspondente a situação do aluno\nMatriculado(M), Trancado(T) ou Desligado(D)\n");
        this.escolhido = s.nextLine();
        this.situacao = conversao(escolhido);
    }
    public void mostrarDados()
    {
        System.out.println("Nome do aluno: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("CPF: "+this.cpf);
        switch(situacao)
        {
            case 1:
                System.out.println("Aluno matriculado!");
            break;
            case 2:
                System.out.println("Aluno com a matricula trancada!");
            break;
            case 3:
                System.out.println("Aluno desligado!");
            break;
            case 0:
                System.out.println("Não há como prever a situacao do aluno!!");
        }
    }
    public void setCurso(Curso curso)
    {
            this.curso=curso;
    }
    public String getMatricula()
    {
        return this.matricula;
    }
    public String getCpf()
    {
        return this.cpf;
    }
    public static ArrayList getArray()
    {
        return alunos;
    }
}