package pacote;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Aluno
{
  private String nome;
  private String matricula;
  private String cpf;
  private Curso curso = new Curso();
  private byte situacao;//variável acrescentada pratica 2
  

  public byte getSituacao()
	{
		return this.situacao;
	}
  public boolean setSituacao(String situacao)
  {
      if(situacao.equals("M")||situacao.equals("T")||situacao.equals("D"))
      {
          switch(situacao)
          {
              case "M":this.situacao=1;return true;
              case "D":this.situacao=2;return true;
              case "T":this.situacao=3;return true;
          }
      }
      else
      {
          System.out.println("Situacao invalido!");
          return false;
      }
      return false;
  }
        
      
    public boolean setNome(String nome)
    {
        if (nome.length() > 0) 
        {
            this.nome = nome;
            return true;
        }
        else
        {
            System.out.println("Nome invalido!");return false;
        }
    }
    
    public String getMatricula()
    {
        return this.matricula;
    }
    public boolean setMatricula(String matricula)
    {
        if (matricula.length() > 0) 
        {
            this.matricula = matricula;
            return true;
        }
        else
        {
            System.out.println("Matrícula invalida!");return false;
        }
    }
    
    public boolean setCpf(String strCpf )
   {
      int     d1, d2;
      int     digito1, digito2, resto;
      int     digitoCPF;
      String  nDigResult;

      d1 = d2 = 0;
      digito1 = digito2 = resto = 0;

      for (int nCount = 1; nCount < strCpf.length() -1; nCount++)
      {
         digitoCPF = Integer.valueOf (strCpf.substring(nCount -1, nCount)).intValue();

         //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
         d1 = d1 + ( 11 - nCount ) * digitoCPF;

         //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
         d2 = d2 + ( 12 - nCount ) * digitoCPF;
      };

      //Primeiro resto da divisão por 11.
      resto = (d1 % 11);

      //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
      if (resto < 2)
         digito1 = 0;
      else
         digito1 = 11 - resto;

      d2 += 2 * digito1;

      //Segundo resto da divisão por 11.
      resto = (d2 % 11);

      //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
      if (resto < 2)
         digito2 = 0;
      else
         digito2 = 11 - resto;

      //Digito verificador do CPF que está sendo validado.
      String nDigVerific = strCpf.substring (strCpf.length()-2, strCpf.length());

      //Concatenando o primeiro resto com o segundo.
      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

      //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
      return nDigVerific.equals(nDigResult);}
  
  public void lerDados()
    {
         Scanner s = new Scanner(System.in);
         
         System.out.println("Digite o nome do aluno:");
         while (!setNome(s.nextLine()));
         
         System.out.println("Digite a matrícula do aluno:");
         while (!setMatricula(s.nextLine()));
         
         System.out.println("Digite o cpf do aluno:");
        while (!setCpf(s.nextLine()));
         
        System.out.println("Digite a situação do aluno: Matriculado(M), Trancado(T) ou Desligado(D)");
        while(!setSituacao(s.next()));
       
        
         curso = new Curso();
         curso.lerDados();
    }
    public void mostrarDados() 
    {
        System.out.println("Nome do aluno: "+this.nome);
        System.out.println("Matricula do aluno: "+this.matricula);
        System.out.println("CPF do aluno: "+this.cpf);
            switch(getSituacao())
	{
            case 1:System.out.println("Situacao do aluno:Matriculado");break;
            case 2:System.out.println("Situacao do aluno:Trancado");break;
            case 3:System.out.println("Situacao do aluno:Desligado");break;
        }
        curso.mostrarDados();
    }
}
