package pacote;
///Autora: Patrícia Duarte da SIlva - 201514322
import java.util.Scanner;
public class Funcionario
{
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String ctps;
    private double salario;
    
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
    
    public boolean setEndereco(String endereco)
    {
        if (endereco.length() > 0)
        {
            this.endereco = endereco;
            return true;
        }
        else 
        {
            System.out.println("Endereço inválido!");
            return false;
        }
    }
    
    public boolean setTelefone(String telefone)
    {
        if (telefone.length() > 0) 
        {
            this.telefone = telefone;
            return true;
        }
        else 
        {
            System.out.println("Telefone inválido!");
            return false;
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
  
    
    public String getctps()
    {
        return this.ctps;
    }
    
    public boolean setCtps(String ctps)
    {
        if (ctps.length() > 0) 
        {
            this.ctps = ctps;
            return true;
        }
        else 
        {   
            System.out.println("CTPS inválido!");
            return false;
        }
    }
    
    public boolean setSalario(double salario)
    {
        if(salario > 0)
        {
            this.salario = salario;
            return true;
        }
        else 
        {
            System.out.println("Salario inválido!");
            return false;
        }
    } 
    
    
    
    public void lerDados()
    {
         Scanner s = new Scanner(System.in);
         System.out.println("Digite o nome do funcionario:");
         while (!setNome(s.nextLine()));
         
         System.out.println("Digite o endereço do funcionario:");
         while (!setEndereco(s.nextLine()));
         
         System.out.println("Digite o telefone do funcionario:");
         while (!setTelefone(s.nextLine()));
         
         System.out.println("Digite o CPF do funcionario:");
         while (!setCpf(s.nextLine()));
         
         System.out.println("Digite a CTPS do funcionario:");
         while (!setCtps(s.nextLine()));
         
         System.out.println("Digite o salário do funcionário:");
         while(!setSalario(s.nextDouble()));
         
    }
    
    public void mostrarDados()
    {
        System.out.println("Nome do funcionário: "+this.nome);
        System.out.println("Endereço do funcionário: "+this.endereco);
        System.out.println("Telefone do funcionário: "+this.telefone);
        System.out.println("CPF do funcionário: "+this.cpf);
        System.out.println("CTPS do funcionário: "+this.ctps);
        System.out.println("Salário do funcionário"+this.salario);
    }
}

    
    
  

  


