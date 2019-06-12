package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class MenuTecnico
{
    public int menu5()
    {
        int opcao;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a opcao desejada:");
        System.out.println("1.Cadastrar Tecnico");
        System.out.println("2.Listar Tecnico");
        System.out.println("3.Buscar Tecnico");
        System.out.println("4.Excluir Tecnico");
        System.out.println("5.Voltar");
        opcao=s.nextInt();
        return opcao;
    }
}