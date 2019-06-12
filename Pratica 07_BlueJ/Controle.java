//Autora:Patrícia Duarte da Silva - 201514322
import java.util.Scanner;
public class Controle {
    private static int escolha;
    private static Menu m = new Menu();
    private static ControleDisciplina controle = new ControleDisciplina();
    private static ControleCurso controle2 = new ControleCurso();
    private static ControleAluno controle3 = new ControleAluno();
    private static ControleTecnico controle4 = new ControleTecnico();
    private static ControleProfessor controle5 = new ControleProfessor();
    
    public static int processar(){
        escolha=m.menu1();
        switch (escolha) {
            case 1:
               controle.processar();
               return 1;
            case 2:
                controle2.processar();
                return 2;
            case 3:
                controle3.processar();
                return 3;
            case 4:
                controle4.processar();
                return 4;
            case 5:
                controle5.processar();
                return 5;
            case 9:
                return 9;
        }
        return 0;
    }
}