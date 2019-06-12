//Autora: PATRÍCIA DUARTE DA SILVA  - 201514322
package exercicio2Lista;
import java.util.ArrayList;
import java.util.List;

public class Lista 
{
	static List<String>cadastro = new ArrayList<>();
 public void retornaMatricula()
 {
	System.out.println("Matrícula:");
	for(int i=0; i<cadastro.size(); i++)
        {
                String[] vetor = cadastro.get(i).split(",");
		System.out.println(vetor[1]);
	}	
 }
    public static void main(String[] args)
    {
	cadastro.add("Matheus , 1234589");
	cadastro.add("Joseph , 3495052");
	cadastro.add("Maria , 9139122");
	cadastro.add("Gustavo , 182321");
	cadastro.add("João , 112323");
	cadastro.add("Zé , 1123123");
	cadastro.add("Pedro , 0031322");
	cadastro.add("Ingrid , 1231232");
	cadastro.add("Roberto , 0313445");
	cadastro.add("Renata , 9130123");
		
	Lista objeto = new Lista();
	objeto.retornaMatricula();
	}
}