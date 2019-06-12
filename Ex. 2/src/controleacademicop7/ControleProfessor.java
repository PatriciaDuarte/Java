package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.InputMismatchException;
public class ControleProfessor
{
    private static int escolha;
    private static MenuProfessor m = new MenuProfessor();
    static private Professor p = new Professor();
    static private Scanner s = new Scanner(System.in);
    static private int ctps;
    
    public static void processar()
    {
        escolha=m.menu6();
        switch (escolha)
        {
            case 1:
                p.lerDados();
                p.adicionar(p);
                break;
            case 2:
                p.listar();
                break;
            case 3:
                try
                {
                    System.out.println("Entre com o ctps do professor:");
                    ctps=s.nextInt();
                    p.buscar(ctps);
                } catch( InputMismatchException e)
                {
                    System.err.printf("\nExceção: %s \n ", e);
                    System.out.println("Você deve entrar com ctps inteiro.Por favor tente novamente.");
                 }
                break;
            case 4:
                try
                {
                    System.out.printf("Entre com o ctps do professor:");
                    ctps=s.nextInt();
                    p.excluir(ctps);
                }catch( InputMismatchException e)
                {
                    System.err.printf("\nExceção: %s \n ", e);
                    System.out.println("Você deve entrar com ctps inteiro.Por favor tente novamente.");
                }
                break;
            case 5:
                break;
        }
    }
}