//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
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
                System.out.println("Entre com o codigo da disciplina:"); //Buscar disciplina
                coddisciplina=s.nextInt();
                d.buscar(coddisciplina);
                break;
            case 4:
                System.out.printf("Entre com o codigo da Disciplina:"); //Excluir Disciplina
                coddisciplina=s.nextInt();
                d.excluir(coddisciplina);
                break;
            case 5:
                break;
        }
    }
}