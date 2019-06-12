//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
import java.util.ArrayList;
public class Professor extends Funcionario
{
    private String tit;
    private String area;
    private static int numeroHorasAula;
    private static double valorHoraAula;
    private static double salarioBase;
    private static int k;
    private static Professor p = new Professor();
    private static double numHoras;
    private static ArrayList<Professor> Professores = new ArrayList<Professor>();
 
    public static void adicionar(Professor p)
    {
        Professores.add(p);
        System.out.printf("Total de professores inseridos:%d\n",Professores.size());
    }
    
    public static void listar()
    {
        for(Professor objeto:Professores)
            objeto.mostrardados();
    }
    
    public static void buscar(int ctps)
    {
        for(Professor objeto:Professores)
        {
            if(objeto.getCtps()==ctps)
            {
                System.out.println("Professor encontrado!");
                objeto.mostrardados();
            }
        }
    }
    
    public static void excluir(int ctps)
    {
        for(k=0;k<Professores.size();k++)
        {
            p=Professores.get(k);
            if(p.getCtps()==ctps)
            {
                Professores.remove(k);
                System.out.println("Professor removido!");
                break;
            }
        }
    }
    public boolean setTit(String tit)
    {
        if (tit.length() > 0) 
        {
            this.tit = tit;
            return true;
        }
        else
        {
            System.out.println("Titulação invalida!");
            return false;
        }
    }
    public boolean setArea(String area)
    {
        if(area.length() > 0) 
        {
            this.area = area;
            return true;
        }
        else
        {
            System.out.println("Area invalida!");
            return false;
        }
    }
    public boolean setnumeroHorasAula(int numeroHorasAula)
    {
        if(numeroHorasAula > 0)
        {
            this.numeroHorasAula = numeroHorasAula;
            return true;
        }
        else
        {
            System.out.println("Numero de horas invalido!");
            return false;
        }
    }
    public boolean setvalorHoraAula(double valorHoraAula)
    {
        if(valorHoraAula > 0)
        {
            this.valorHoraAula = valorHoraAula;
            return true;
        }
        else
        {
            System.out.println("Valor da aula invalido!");
            return false;
        }
    }
	public boolean setnumHoras(double numHoras)
	{
        if(numHoras > 0)
        {
            this.numHoras = numHoras;
            return true;
        }
        else
        {
            System.out.println("Numero de horas invalido!");
            return false;
        }
    }
        
    public void lerDados()
    {
        super.lerDados();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a titulacao do professor: ");
            while (!setTit(s.nextLine()));
        System.out.println("Digite a area do professor: ");
            while (!setArea(s.nextLine()));
        System.out.println("Digite a quantidade de horas do professor: ");
            while (!setnumeroHorasAula(s.nextInt()));
        System.out.println("Digite o valor da hora/aula do professor: ");
            while (!setvalorHoraAula(s.nextDouble()));
	System.out.println("Digite o valor de horas para o outro calculo do salario: ");
            while(!setnumHoras(s.nextDouble()));
    }
    public void mostrardados()
    {
        super.mostrarDados();
        System.out.println("Titulacao: "+this.tit);
        System.out.println("Area: "+this.area);
        System.out.println("Calculo do salario: "+calcSalario(salarioBase, valorHoraAula, numeroHorasAula));
	System.out.println("Segundo calculo do salario: "+calcSalario(numHoras));
    }

    public double calcSalario(double salarioBase, double valorHoraAula, int numeroHorasAula)
    {
        return (numeroHorasAula * valorHoraAula);
    }
    public int getnumeroHorasAula()
    {
        return this.numeroHorasAula;
    }
    public double getvalorHoraAula()
    {
        return this.valorHoraAula;
    }
	public double calcSalario(double numHoras)
        {
		return (50 * numHoras);
	}
}