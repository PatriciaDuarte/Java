//AUTORA: PATRICIA DUARTE DA SILVA - 201514322
package string.pkg7.aula.pkg18;
import java.util.Scanner;
public class String7Aula18 
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        
        System.out.println("Escolha uma palavra da frase escrita:");
        String palavraEscolhida= entrada.nextLine();
        int fraseSubstituida = frase.indexOf(palavraEscolhida);
        System.out.println("Posição da palavra escolhida:"+ fraseSubstituida);
    }
    
}
