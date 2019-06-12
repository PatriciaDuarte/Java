//Autora: Patrícia Duarte da Silva - 201514322

import java.util.Scanner;
public class characterSetByUser 
{
	public static int numeroDeDigitos(String charUser)
	{
		  int contador=0;
		  for(int i=0; i<charUser.length();i++)
		  {
			  char n= charUser.charAt(i);
		  
			  if (n=='0')
			  {
				  contador++;
			  }
			  if (n=='1')
			  {
				  contador++;
			  }
			  if (n=='2')
			  {
				  contador++;
			  }
			  if (n=='3')
			  {
				  contador++;
			  }
			  if (n=='4')
			  {
				  contador++;
			  }
			  if (n=='5')
			  {
				  contador++;
			  }
			  if (n=='6')
			  {
				  contador++;
			  }
			  if (n=='7')
			  {
				  contador++;
			  }
			  if (n=='8')
			  {
				  contador++;
			  }
			  if (n=='9')
			  {
				  contador++;
			  }
		}
		  return contador;
	  }
		  
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		 System.out.println("Digite uma frase:");
		 String charUser = in.nextLine();
		 in.close();
		 
		  
		//Retorna  o numeros de caracteres
		//String charUser = "Patricia"; // caractere dado pelo usuário
		int numero = charUser.length();
		System.out.println("Numero de caracteres: " + numero);
		
		//Retorna os caracteres maiusculos
		String maiuscula = charUser.toUpperCase();
		System.out.println("Caracteres maiusculos:" + maiuscula);
		
		//Se a string começa com "uni"
		 System.out.println("Começa com uni? "+ charUser.toLowerCase().startsWith("uni"));		
		
		//se a String termina com "rio"
		 System.out.println("Termina com rio? "+ charUser.toLowerCase().endsWith("rio"));
		 
		 //O numero de digitos de 0 a 9 da string 
		 System.out.println("Número de dígitos: " +numeroDeDigitos(charUser));
	
		 //
		
	}
}

