package pacote;
 
//Autora: Patrícia Duarte da SIlva - 201514322
import java.util.Scanner;
public class Tecnicos extends Funcionario
{
    private String cargo;
    private String departamento;
    private double salarioBase;
    private double valorHoraExtra;
    private int quantidadeHoraExtra;
   
        public  double calcSalario()
    {
            return  salarioBase + (valorHoraExtra * quantidadeHoraExtra);
    }
    
    
    public boolean setquantidadeHoraExtra(int quantidadeHoraExtra)
    {
        if(quantidadeHoraExtra>0)
        {
            this.quantidadeHoraExtra = quantidadeHoraExtra;
            return true;
        }else
        {
            System.out.println("Quantidade de hora extra inválida!");return false;
        }
    }
     public boolean setvalorHoraExtra(double valorHoraExtra)
    {
        if (valorHoraExtra > 0) 
        {
            this.valorHoraExtra = valorHoraExtra;
            return true;
        }
        else
        {
            System.out.println("Valor hora extra invalido!");return false;
        }
    }
    
    
    public boolean setsalarioBase(double salarioBase)
    {
        if (salarioBase > 0) 
        {
            this.salarioBase = salarioBase;
            return true;
        }
        else
        {
            System.out.println("Salario base invalido!");return false;
        }
    }
    
    
    public boolean setCargo(String cargo)
    {
        if (cargo.length() > 0) 
        {
            this.cargo = cargo;
            return true;
        }
        else
        {
            System.out.println("Cargo invalido!");return false;
        }
    }
    
    public boolean setDepartamento(String departamento)
    {
        if(departamento.length() > 0 )
        {
            this.departamento = departamento;
            return true;
        }else
        {
            System.out.println("Departamento inválido!");return false;
        }
    }
    public void lerDados()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o cargo do técnico:");
        while (!setCargo(s.nextLine()));
        System.out.println("Digite o departamento do técnico:");
        while (!setDepartamento(s.nextLine()));
        System.out.println("Digite o salário base do técnico:");
        while(!setsalarioBase(s.nextDouble()));
        System.out.println("Digite o valor Hora Extra:");
        while(!setvalorHoraExtra(s.nextDouble()));
        System.out.println("Digite a quantidade de hora extra:");
        while(!setquantidadeHoraExtra(s.nextInt()));
    }
    
    public void mostrarDados()
    {
        System.out.println("Cargo do técnico: "+this.cargo);
        System.out.println("Departamento do técnico: "+this.departamento);
        System.out.println("Salario técnico calculado:"+calcSalario() );
    }

}