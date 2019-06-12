package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
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
                System.out.println("Entre com o ctps do tecnico:"); //Buscar tecnico
                ctps=s.nextInt();
                t.buscar(ctps);
                break;
            case 4:
                System.out.printf("Entre com o ctps do tecnico:"); //Excluir tecnico
                ctps=s.nextInt();
                t.excluir(ctps);
                break;
            case 5:
                break;
        }
    }
}