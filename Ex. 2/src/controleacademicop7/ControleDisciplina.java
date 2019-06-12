package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.InputMismatchException;
public class ControleDisciplina
{
    private static int escolha;
    private static MenuDisciplina m = new MenuDisciplina();
    private static Disciplina d = new Disciplina();
    static private int coddisciplina;
    static private Scanner s = new Scanner(System.in);
    
    public static void processar()
    {
        escolha=m.menu2();
        switch (escolha)
        {
            case 1:
                d.lerDados(); 
                d.adicionar(d);
                break;
            case 2:
                d.listar();
                break;
            case 3:
                try
                {
                    System.out.println("Entre com o codigo da disciplina:"); //Buscar disciplina
                    coddisciplina=s.nextInt();
                    d.buscar(coddisciplina);
                } catch( InputMismatchException e)
                {
                    System.err.printf("\nExceção: %s \n ", e);
                    System.out.println("Você deve entrar com codigo inteiro.Por favor tente novamente.");
                }
                break;
            case 4:
                try
                {
                    System.out.printf("Entre com o codigo da Disciplina:"); //Excluir Disciplina
                    coddisciplina=s.nextInt();
                    d.excluir(coddisciplina);
                } catch( InputMismatchException e)
                {
                    System.err.printf("\nExceção: %s \n ", e);
                    System.out.println("Você deve entrar com código inteiro.Por favor tente novamente.");
                }
                break;
            case 5:
                break;
        }
    }
}