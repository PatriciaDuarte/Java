package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class MenuProfessor
{    
    public int menu6()
    {
        int opcao;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a opcao desejada:");
        System.out.println("1.Cadastrar Professor");
        System.out.println("2.Listar Professor");
        System.out.println("3.Buscar Professor");
        System.out.println("4.Excluir Professor");
        System.out.println("5.Voltar");
        opcao=s.nextInt();
        return opcao;
    }
}