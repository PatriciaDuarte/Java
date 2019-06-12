//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class MenuDisciplina
{
    public int menu2()
    {
        int opcao;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a opcao desejada:");
        System.out.println("1.Cadastrar Disciplina");
        System.out.println("2.Listar Disciplina");
        System.out.println("3.Buscar Disciplina");
        System.out.println("4.Excluir Disciplina");
        System.out.println("5.Voltar");
        opcao=s.nextInt();
        return opcao;
    }
}