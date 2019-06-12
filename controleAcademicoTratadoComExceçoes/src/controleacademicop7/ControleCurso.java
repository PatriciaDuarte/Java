package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.InputMismatchException;
public class ControleCurso
{
    private static int escolha;
    private static MenuCurso m = new MenuCurso();
    private static Curso c = new Curso();
    static private int cod_curso;
    static private Scanner s = new Scanner(System.in);
    
    public static void processar()
    {
        escolha=m.menu3();
        switch (escolha)
        {
            case 1:
                c.lerDados();
                c.adicionar(c);
                 break;
            case 2:
                c.listar();
                break;
            case 3:
                try
                {
                System.out.println("Entre com o codigo do curso: ");
                cod_curso=s.nextInt();
                c.buscarCurso(cod_curso);
                }
                catch( InputMismatchException e)
               {
                    System.err.printf("\nExceção: %s \n ", e);
                    System.out.println("Você deve entrar com o codigo do curso inteiro.Por favor tente novamente.");
               }
                
                break;
            case 4:
                try
                {
                System.out.printf("Entre com o codigo do curso: ");
                cod_curso=s.nextInt();
                c.excluir(cod_curso);
                } catch( InputMismatchException e)
                {
                System.err.printf("\nExceção: %s \n ", e);
                System.out.println("Você deve entrar com  o codigo do curso inteiro.Por favor tente novamente.");
                }
                break;
            case 5:
                break;
        }
    }
}