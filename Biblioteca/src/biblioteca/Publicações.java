package Biblioteca;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Publicações implements Ações{
	
	protected String titulo, autor, editora;
	protected int edição, numchamada;
	ArrayList<String> cadastro = new ArrayList<>();
	
	public Publicações(){
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdição() {
		return edição;
	}

	public void setEdição(int edição) {
		this.edição = edição;
	}

	public int getNumchamada() {
		return numchamada;
	}

	public void setNumchamada(int numchamada) {
		this.numchamada = numchamada;
	}
	
	public void entrada(){
		setTitulo(JOptionPane.showInputDialog("O titulo que deseja: "));
		setAutor(JOptionPane.showInputDialog("O nome do autor: "));
		setEditora(JOptionPane.showInputDialog("O nome da Editora: "));
		setEdição(Integer.parseInt(JOptionPane.showInputDialog("O numero da edição: ")));
		setNumchamada(Integer.parseInt(JOptionPane.showInputDialog("O numero da Chamada: ")));
	}
	
	public void cadastrar(String path, List<String>lista)  throws IOException  {

		File arquivo = new File(path); 
		FileWriter fw = null;
		try {
			fw = new FileWriter(arquivo, true);
		} catch (IOException ex) {
			Logger.getLogger(Livro.class
					.getName()).log(Level.SEVERE, null, ex);
		}
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			for(int i=0;i<lista.size();i++){
			bw.write(lista.get(i));

			bw.newLine();}

		} catch (IOException ex) {
			Logger.getLogger(Livro.class
					.getName()).log(Level.SEVERE, null, ex);
		}
		try {
			bw.flush();
		} catch (IOException ex) {
			Logger.getLogger(Livro.class
					.getName()).log(Level.SEVERE, null, ex);
		}
		try {
			bw.close();
		} catch (IOException ex) {
			Logger.getLogger(Livro.class
					.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("salvo");
	}

	public void busca(String path) throws IOException{
		BufferedReader obras = new BufferedReader(new FileReader(path));
		String linha, palavra;	
		palavra = JOptionPane.showInputDialog("Qual obra você deseja");
		System.out.print(palavra);
		String temp="";
		linha = obras.readLine();
		System.out.print(linha);
		while(linha!=null){	
			if(linha != null){	
				System.out.println(linha);

				if(linha.contains(palavra)){
					System.out.println(linha);
					temp = temp+"\n"+linha;
				}	 	
				linha = obras.readLine();	
			}
		}
		if(!temp.equals(""))
			JOptionPane.showMessageDialog(null, "A obra "+temp+"\n  está disponivel na nossa biblioteca!");
		else
			JOptionPane.showMessageDialog(null, "A obra "+temp+"\n não está disponivel na nossa biblioteca!");

		obras.close();	
	}
	
	public void listar(String path) throws IOException{
		List<String> result=new ArrayList<>();
		BufferedReader obras = new BufferedReader(new FileReader("Geral.txt"));
		String linha;	
		linha = obras.readLine();
		result.add(linha);
		System.out.println(linha);	

		while(linha!=null){	
			if(linha != null){	
				System.out.println(linha);
				result.add(linha);
			}	
			linha = obras.readLine();	
		}	
		cadastrar("Backup.txt", result);
		JOptionPane.showMessageDialog(null, "Um novo arquivo chamado 'Backup'foi criado no diretorio contendo todo o arcevo disponivel na biblioteca!");
	}
}
