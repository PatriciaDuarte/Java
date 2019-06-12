package pacote;
//Autora: Patrícia Duarte - 201514322
import java.util.ArrayList;
import java.util.Scanner;
public class Principal
{
public static void main(String[] args) 
    {
     Scanner s = new Scanner(System.in);
     ArrayList<Aluno> alunos = new ArrayList<Aluno>();
     ArrayList<Professor> professores = new ArrayList<Professor>();
     ArrayList<Curso> cursos = new ArrayList<Curso>();
     ArrayList<Tecnicos> tecnicos = new ArrayList<Tecnicos>();
     ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
 
     Aluno a = new Aluno();//DECLARA UMA VARIAVEL DO TIPO ALUNO
     Professor p = new Professor();
     Curso c = new Curso();
     Tecnicos t = new Tecnicos();
     Disciplina d = new Disciplina();
     Menu m = new Menu();
     String matricula = "";
     String ctps;
     int opcao, opcao2,x;
     int codC,codD;
      
     while (true)
     {
      opcao=m.menu();
      if (opcao == 0)
       {
         System.out.println("Opção Inválida!!");
       } else
       {
       if (opcao == 9) // colocquei a opção 9 para finalizar o programa , pq estava assim na especificação do exercicio.
       {
        break;//FINALIZA O PROGRAMA
       }else
       {
       switch (opcao)
        {
        case 1:
            {
             opcao2 = m.aluno();
             if( opcao2==9 || opcao2==0) break;
             else
             {
              switch (opcao2)
               {
                case 1: 
                    a = new Aluno(); 
                    a.lerDados();                                 
                    alunos.add(a); 
                    System.out.println("\nTotal de alunos inseridos...:\n");
                    System.out.println(alunos.size());
                    break;
                         
                case 2://LISTAR
                    for (Aluno objeto: alunos)
                    {
                      objeto.mostrarDados();
                    }
                    break;
                                      
                case 3: //BUSCAR
                    System.out.println("Entre com o numero de matricula do aluno..:");
                    matricula = s.nextLine();
                    for ( Aluno objeto: alunos)
                    {
                       if (objeto.getMatricula() == matricula)
                       {
                          System.out.println("Aluno encontrado!");
                          objeto.mostrarDados();
                       }
                    }
                    break;
                    
                case 4: //EXCLUIR
                    System.out.println("\nEntre com o numero de matricula do aluno..:\n");
                    matricula = s.nextLine();
                    int i = 0;
                    for (i=0; i < alunos.size(); i++)
                    {
                        a = alunos.get(i);
                        if (a.getMatricula() == matricula){
                            alunos.remove(i);
                            System.out.println("\nAluno removido!\n");
                            break;
                            }
                    }break;
                }
             }
          }break;
        case 2:
        {       //opção professor                           
            opcao2 = m.professor();
            if(opcao2==9 || opcao2==0) break;
            else
            {
                switch (opcao2)
                {
                case 1:
                    p = new Professor(); 
                    p.lerDados();
                    professores.add(p); 
                    System.out.println("\nTotal de professores inseridos...:\n");
                    System.out.println(professores.size());
                break;
                                    
                case 2://LISTAR
                    for (Professor objeto: professores) 
                        {
                          objeto.mostrarDados();
                        }
                break;
                                    
                case 3: //BUSCAR
                    System.out.println("Entre com o codigo do professor..:");
                    ctps = s.nextLine();
                    for ( Professor objeto: professores)
                    {
                        if (objeto.getctps() == ctps)
                        {
                          System.out.println("Professor encontrado!");
                          objeto.mostrarDados();
                        }
                    }
                break;
                                 
                case 4: //EXCLUIR
                System.out.println("Entre com o codigo do professor..:");
                ctps = s.nextLine();
                int i = 0;
                for (i=0; i < professores.size(); i++)
                {
                    p = professores.get(i);
                    if (p.getctps() == ctps)
                    {
                        professores.remove(i);
                        System.out.println("Professor removido!");
                        break;
                    }
                }
            }
        }
    }
    break;
        case 3://Tecnicos
        {
            opcao2 = m.tecnico();
            if(opcao2==9 || opcao2==0) break;
            else
            {
                switch (opcao2)
                {
                    case 1: 
                        t = new Tecnicos(); 
                        t.lerDados();
                        tecnicos.add(t); 
                        System.out.println("Total de Técnicos inseridos...: ");
                        System.out.println(tecnicos.size());
                    break;
                                
                    case 2://LISTAR
                        for (Tecnicos objeto: tecnicos) 
                        {
                            objeto.mostrarDados();
                        }
                    break;
                               
                    case 3: //BUSCAR
                        System.out.println("Entre com codigo do tecnico..:");
                        ctps = s.nextLine();
                        for ( Tecnicos objeto: tecnicos)
                        {
                            if (objeto.getctps() == ctps)
                            {
                                System.out.println("Tecnico encontrado!");
                                objeto.mostrarDados();
                            }
                        }
                    break;
                                 
                   case 4: //EXCLUIR
                        System.out.println("Entre com o numero de ctps do tecnico..:");
                        ctps = s.nextLine();
                        int i = 0;
                        for (i=0; i < tecnicos.size(); i++)
                        {
                            t = tecnicos.get(i);
                            if (t.getctps() == ctps)
                                {
                                    tecnicos.remove(i);
                                    System.out.println("Tecnico removido!");
                                    break;
                                }
                        }
                    }
                }
            }
        break;
        case 4://disciplina
            {                                   
                opcao2 = m.disciplina();
                if(opcao2==9 || opcao2==0) break;
                else
                {
                    switch (opcao2)
                    {
                    case 1: 
                         d = new Disciplina(); 
                         d.lerDados();
                         disciplina.add(d); 
                         System.out.println("Total de disciplinas inseridas...: ");
                         System.out.println(disciplina.size());
                    break;
                                    
                    case 2://LISTAR
                        for (Disciplina objeto: disciplina) 
                        {
                            objeto.mostrarDados();
                        }
                    break;
                                        
                    case 3: //BUSCAR
                        System.out.println("Entre com o codigo da disciplina..:");
                        codD = s.nextInt();
                        for ( Disciplina objeto: disciplina)
                        {
                            if (objeto.getCodigo() == codD){
                                System.out.println("Disciplina encontrada!");
                                objeto.mostrarDados();
                            }
                        }
                    break;
                    case 4: //EXCLUIR
                        System.out.println("Entre com o codigo da disciplina..:");
                        codD = s.nextInt();
                        int i = 0;
                        for (i=0; i < disciplina.size(); i++)
                        {
                            d = disciplina.get(i);
                            if (d.getCodigo() == codD)
                                {
                                    disciplina.remove(i);
                                    System.out.println("Disciplina removida!");
                                    break;
                                }
                        }
                    }
                }
            }
            break;
                          
            case 5:
            {   //curso                               
                opcao2 = m.curso();
                if(opcao2==9 || opcao2==0) break;
                else
                {
                    switch (opcao2)
                    {
                    case 1: 
                        c = new Curso(); 
                        c.lerDados();
                        cursos.add(c); 
                        System.out.println("Total de cursos inseridos...: ");
                        System.out.println(cursos.size());
                    break;
                                            
                    case 2://LISTAR
                        for (Curso objeto: cursos) 
                        {
                            objeto.mostrarDados();
                        }
                    break;
                    case 3: //BUSCAR
                        System.out.println("Entre com o codigo do curso..:");
                        codC = s.nextInt();
                        for ( Curso objeto: cursos)
                        {
                           if (objeto.getCodigo() == codC)
                            {
                                System.out.println("Curso encontrado!");
                                objeto.mostrarDados();
                            }
                        }
                    break;
                                            
                    case 4: //EXCLUIR
                        System.out.println("Entre com o codigo do curso..:");
                        codC = s.nextInt();
                        int i = 0;
                        for (i=0; i < cursos.size(); i++)
                        {
                            c = cursos.get(i);
                            if (c.getCodigo() == codC)
                            {
                                cursos.remove(i);
                                System.out.println("Curso removido!");
                                break;
                            }
                        }
                    }
                }
                break;
            }
            case 6:break;
        }
       }      
     }
   }
 }
}
