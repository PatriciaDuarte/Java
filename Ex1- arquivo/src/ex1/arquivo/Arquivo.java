package ex1.arquivo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo
{
    static List<Double>notas = new ArrayList<>();
 
   public  void leitor(String path) throws IOException
   {
     BufferedReader buffRead = new BufferedReader(new FileReader(path));
     double soma=0.0;
     double media=0.0;
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
    
    for(int i=0;i<notas.size();i++)
    {
    	soma=soma+notas.get(i);
    }
    media=soma/notas.size();
    String b;
    b = String.valueOf(media); 
    escritor("C:\\Users\\Patricia\\Documents\\NetBeansProjects\\Ex1- arquivo\\teste.txt",b);
    System.out.println(media);
}

   public  void escritor(String path, String media1) throws IOException 
   {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        buffWrite.write("escreva algo: "+media1);
        buffWrite.newLine();//}
        buffWrite.close();
   }
     public static void main(String[] args) throws IOException 
    {
        Arquivo arquivo =new Arquivo();
        arquivo.leitor("C:\\Users\\Patricia\\Documents\\NetBeansProjects\\Ex1- arquivo\\teste.txt");
     }
}