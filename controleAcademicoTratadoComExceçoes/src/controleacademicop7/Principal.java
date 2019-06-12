package controleacademicop7;

//Autora:Patrícia Duarte da Silva - 201514322
public class Principal
{
    public static void main(String[] args)
    {
        Controle controle = new Controle();
        while((controle.processar())!=9)
            controle.processar();
    }
}   