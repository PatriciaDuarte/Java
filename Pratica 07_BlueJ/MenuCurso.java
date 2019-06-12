//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class MenuCurso
{
     public int menu3()
     {
        int opcao;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a opcao desejada:");
        System.out.println("1.Cadastrar Curso");
        System.out.println("2.Listar Curso");
        System.out.println("3.Buscar Curso");
        System.out.println("4.Excluir Curso");
        System.out.println("5.Voltar");
        opcao=s.nextInt();
        return opcao;
    }
}