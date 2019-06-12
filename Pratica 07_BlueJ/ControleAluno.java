//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class ControleAluno
{
    private static int escolha;
    private static MenuAluno m = new MenuAluno();
    static private Aluno a = new Aluno();
    private static Curso c = new Curso();
    static private Scanner s = new Scanner(System.in);
    static private String matricula;
    
    public static void processar()
    {
        escolha=m.menu4();
        switch (escolha)
        {
            case 1:
                a.lerdados();
                a.adicionar(a);
                break;
            case 2:
                a.listar();
                break;
            case 3:
                System.out.println("Entre com o numero de matricula do aluno: "); //Buscar
                matricula=s.next();
                a.buscar(matricula);
                break;
            case 4:
                System.out.printf("Entre com o numero de matricula do aluno: "); //Excluir
                matricula=s.next();
                a.excluir(matricula);
                break;
            case 5:
                a.inserirCurso();
                break;
            case 6:
                break;
        }
    }
}