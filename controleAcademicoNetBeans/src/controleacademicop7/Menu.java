package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class Menu
{ 
    
   public int menu1()
   {
       int opcao;
       Scanner s = new Scanner(System.in);
       System.out.println("Escolha uma opção:\n");
       System.out.println("1. Disciplina");
       System.out.println("2. Curso");
       System.out.println("3. Aluno");
       System.out.println("4. Tecnico");
       System.out.println("5. Professor");
       System.out.println("9.Finalizar");
       opcao=s.nextInt();
       return opcao;
    }
}
