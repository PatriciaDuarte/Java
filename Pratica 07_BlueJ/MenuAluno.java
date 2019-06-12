//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class MenuAluno 
{    
    public int menu4()
    {
        int opcao;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a opcao desejada:");
        System.out.println("1.Cadastrar Aluno");
        System.out.println("2.Listar Aluno");
        System.out.println("3.Buscar Aluno");
        System.out.println("4.Excluir aluno");
        System.out.println("5.Selecionar curso");
        System.out.println("6.Voltar");
        System.out.println("9.Finalizar");
        opcao=s.nextInt();
        return opcao;
    }
}
