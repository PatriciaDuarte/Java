package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.InputMismatchException;
public class ControleTecnico 
{
    private static int escolha;
    private static MenuTecnico m = new MenuTecnico();
    static private Tecnico t = new Tecnico();
    static private Scanner s = new Scanner(System.in);
    static private int ctps;
    
    public static void processar()
    {
        escolha=m.menu5();
        switch (escolha)
        {
            case 1:
                t.lerDados();
                t.adicionar(t);
                break;
            case 2:
                t.listar();
                break;
            case 3:
                try
                {
                    System.out.println("Entre com o ctps do tecnico:"); //Buscar tecnico
                    ctps=s.nextInt();
                    t.buscar(ctps);
                }catch( InputMismatchException e)
                {
                    System.err.printf("\nExceção: %s \n ", e);
                    System.out.println("Você deve entrar com ctps inteiro.Por favor tente novamente.");
                }
                break;
            case 4:
                try
                {
                    System.out.printf("Entre com o ctps do tecnico:"); //Excluir tecnico
                    ctps=s.nextInt();
                    t.excluir(ctps);
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