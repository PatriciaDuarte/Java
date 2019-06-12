package pacote;
//Autora: Patrícia Duarte da SIlva - 201514322
import java.util.Scanner;
public class Professor extends Funcionario
{
    private String titulacao;
    private String areaPesquisa;
    private double valorHoraAula;
    private int numeroHorasAula;
    
    public  double calcSalario()
    {
            return  numeroHorasAula * valorHoraAula;
    }
    
    
    
    public boolean setnumeroHorasAula(int numeroHorasAula)
    {
        if(numeroHorasAula>0)
        {
            this.numeroHorasAula = numeroHorasAula; return true;
        }else
        System.out.println("Número de horas aula inválida!!");return false;
    
    }
    
    public boolean setvalorHoraAula(double valorHoraAula)
    {
        if (valorHoraAula > 0) 
        {
            this.valorHoraAula = valorHoraAula;
            return true;
        }
        else
        {
            System.out.println("Horas aula inválidas!");return false;
        }
    }
    
    public boolean setTitulacao(String titulacao)
    {
        if (titulacao.length() > 0) 
        {
            this.titulacao = titulacao;
            return true;
        }
        else
        {
            System.out.println("Titulação inválida!");return false;
        }
    }
    
    public boolean setareaPesquisa(String areaPesquisa)
    {
        if (areaPesquisa.length() > 0) 
        {
            this.areaPesquisa = areaPesquisa;
            return true;
        }
        else
        {
            System.out.println("Área de pesquisa invalida!");return false;
        }
    }
    
    public void lerDados()
      {
        super.lerDados();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a titulação do professor:");
         while (!setTitulacao(s.nextLine()));
        System.out.println("Digite a area de pesquisa do professor:");
         while (!setareaPesquisa(s.nextLine()));
         System.out.println("Digite o numero de aulas:");
         while(!setnumeroHorasAula(s.nextInt()));
         System.out.println("Digite o valor das horas das aulas:");
         while(!setvalorHoraAula(s.nextDouble()));
    }
    
        public void mostrarDados() 
    {
        super.mostrarDados();
        System.out.println("Titulação do professor:  "+this.titulacao);
        System.out.println("Área de pesquisa do professor: "+this.areaPesquisa);
        System.out.println("Salario do professor calculado: "+calcSalario() );

    }
}

