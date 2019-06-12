//AUTORA: PATRICIA DUARTE DA SILVA - 201514322
package string.pkg6.aula.pkg18;
import java.util.Scanner;

public class String6Aula18 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        
        System.out.println("Escolha uma palavra para ser substituida:");
        String palavraSubstituida = entrada.nextLine();
        String fraseSubstituida = frase.replaceAll(palavraSubstituida," outraPalavra ");
        System.out.println("Frase substituida:"+ fraseSubstituida);
    }
    
}
