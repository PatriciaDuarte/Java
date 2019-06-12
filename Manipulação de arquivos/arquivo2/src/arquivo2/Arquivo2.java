package arquivo2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Arquivo2
{
    static List<Double>notas = new ArrayList<>();
 
   public  void leitor(String path) throws IOException
   {
     BufferedReader buffRead = new BufferedReader(new FileReader(path));
     String linha;
     linha = buffRead.readLine();

     while (true) 
     {
        if (linha != null)
        {
            notas.add(Double.parseDouble(linha));
        } else
            break;
        linha = buffRead.readLine();
    }
    

    buffRead.close();
}
   
   public  void novoArquivo(String path) throws IOException 
   {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        buffWrite.write("Lista dada no outro arquivo:"+ notas);
        Collections.sort(notas);
        Collections.reverse(notas);
        buffWrite.write("\nLista decrescente:"+ notas);
        notas.add(6,0.0);
        buffWrite.write("\nadcionado 0.0 na posição[6] da lista.. " + notas);
        buffWrite.newLine();//}
        buffWrite.close();
   }
     public static void main(String[] args) throws IOException 
    {
        Arquivo2 arquivo =new Arquivo2();
        arquivo.leitor("C:\\Users\\Patricia\\Documents\\NetBeansProjects\\Ex1- arquivo\\teste.txt");
        arquivo.novoArquivo("C:\\Users\\Patricia\\Documents\\NetBeansProjects\\Ex1- arquivo\\teste2.txt");
     }
}
