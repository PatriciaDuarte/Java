package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException; 
public class Tecnico extends Funcionario
{
    private String cargo;
    private String departamento;
    private static double salarioBase;
    private static double valorHoraExtra;
    private static int quantidadeHoraExtra;
    private static int k;
    private static Tecnico t = new Tecnico();
    private static double quantHoras;    
    private static ArrayList<Tecnico> Tecnicos = new ArrayList<Tecnico>();
   
   public static void adicionar(Tecnico t)
   {
       Tecnicos.add(t);
       System.out.printf("Total de tecnicos inseridos:%d\n",Tecnicos.size());
   }
   public static void listar()
   {
       for(Tecnico objeto:Tecnicos)
            objeto.mostrarDados();
   }
   public static void buscar(int ctps)
   {
        for(Tecnico objeto:Tecnicos)
        {
           if(objeto.getCtps()==ctps)
           {
               System.out.println("Tecnico encontrado!");
               objeto.mostrarDados();
           }
        }
   }
   public static void excluir(int ctps)
   {
       for(k=0;k<Tecnicos.size();k++)
       {
           t=Tecnicos.get(k);
           if(t.getCtps()==ctps)
           {
               Tecnicos.remove(k);
               System.out.println("Tecnico removido");
               break;
            }
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
            System.out.println("Cargo invalido!");
            return false;
        }
   }
   public boolean setDepartamento(String departamento)
   {
       if (departamento.length() > 0) 
       {
           this.departamento = departamento;
           return true;
       }
       else
       {
           System.out.println("Departamento invalido!");
           return false;
       }
   }
   public boolean setsalarioBase(double salarioBase)
   {
       if(salarioBase > 0)
       {
           this.salarioBase = salarioBase;
           return true;
       }
       else
       {
           System.out.println("Salario base invalido!");
           return false;
       }
   }
   public boolean setvalorHoraExtra(double valorHoraExtra)
   {
       if(valorHoraExtra > 0)
       {
           this.valorHoraExtra = valorHoraExtra;
           return true;
       }
       else
       {
           System.out.println("Valor da hora extra invalido!");
           return false;
       }
   }
   public boolean setquantidadeHoraExtra(int quantidadeHoraExtra)
   {
       if(quantidadeHoraExtra > 0)
       {
           this.quantidadeHoraExtra = quantidadeHoraExtra;
           return true;
       }
       else
       {
           System.out.println("Quantidade de hora extra invalido!");
           return false;
       }
   }
   public boolean setquantHoras(double quantHoras)
   {
       if(quantHoras > 0)
       {
           this.quantHoras = quantHoras;
           return true;
       }
       else
       {
           System.out.println("Quantidade de hora extra invalido!");
           return false;
       }
   }   
   public void lerDados()
   { 
        super.lerDados(); 
        Scanner s = new Scanner(System.in); 
        System.out.println("Digite o cargo do tecnico: ");
             while (!setCargo(s.nextLine()));
        System.out.println("Digite o departamento do tecnico: "); 
             while (!setDepartamento(s.nextLine()));
       try{      
            System.out.println("Digite o salario base do tecnico: ");
                  while (!setsalarioBase(s.nextDouble()));
       }catch(InputMismatchException e)
       {
           System.err.printf("\nExceção: %s \n", e);
           System.out.println("Você deve entrar com salario base double.Por favor tente novamente.");
       }
       try{
            System.out.println("Digite o valor da hora extra do tecnico: ");
                  while (!setvalorHoraExtra(s.nextDouble()));
       }catch(InputMismatchException e)
       {
           System.err.printf("\nExceção: %s \n", e);
           System.out.println("Você deve entrar com doubles.Por favor tente novamente.");
       }    
       
       try{
            System.out.println("Digite a quantidade de hora extra do tecnico: ");
             while (!setquantidadeHoraExtra(s.nextInt()));
       }catch(InputMismatchException e)
       {
           System.err.printf("\nExceção: %s \n", e);
           System.out.println("Você deve entrar com inteiros.Por favor tente novamente.");
       }    
       try{ 
            System.out.println("Digite a quantidade de hora extra para o segundo calculo: ");
             while(!setquantHoras(s.nextDouble()));
        }catch( InputMismatchException e)
           {
               System.err.printf("\nExceção: %s \n ", e);
               System.out.println("Você deve entrar com hora extra double.Por favor tente novamente.");
           }
   }
   public void mostrarDados()
   {
       super.mostrarDados();
       System.out.println("Cargo: "+this.cargo);
       System.out.println("Departamento: "+this.departamento);
       System.out.println("Calculo do salario: "+calcSalario(salarioBase, valorHoraExtra, quantidadeHoraExtra));
       System.out.println("Segundo calculo do salario: "+calcSalario(quantHoras));
   }
   public double calcSalario(double salarioBase, double valorHoraExtra, int quantidadeHoraExtra)
   {
       return salarioBase + (valorHoraExtra * quantidadeHoraExtra);
   }
   public static double getsalarioBase()
   {
       return salarioBase;
   }
   public static double getvalorHoraExtra()
   {
       return valorHoraExtra;
   }
   public static int getquantidadeHoraExtra()
   {
       return quantidadeHoraExtra;
   }
   public double calcSalario(double quantHoras) 
   {
       return (quantHoras * 30 + 1000);
    }
}