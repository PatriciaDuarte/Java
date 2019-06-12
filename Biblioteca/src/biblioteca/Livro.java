package Biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Livro extends Publicações {
	private String genero;
	
	public Livro() {
		
	}
	
	public String getGenero(){
		return genero;
	}
	public void setGenero(String gnr){
		this.genero = gnr;
	}
	
	@Override
	public void entrada(){
		String temp="";

		setTitulo(JOptionPane.showInputDialog("LIVOS\nO titulo que deseja: "));
		setGenero(JOptionPane.showInputDialog("LIVROS\nO tipo do livo: "));
		setAutor(JOptionPane.showInputDialog("LIVOS\nO nome do autor: "));
		setEditora(JOptionPane.showInputDialog("LIVOS\nO nome da Editora: "));
		setEdição(Integer.parseInt(JOptionPane.showInputDialog("LIVOS\nO numero da edição: ")));
		setNumchamada(Integer.parseInt(JOptionPane.showInputDialog("LIVOS\nO numero da Chamada: ")));
		temp= "OBRA: "+getTitulo()+"||AUTOR: "+getAutor()+"||Tipo"+getGenero()+"||EDITORA: "+getEditora()+"||EDIÇÂO: "+
				String.valueOf(getEdição())+"||NUMERO DE CHAMADA: "+String.valueOf(getNumchamada()); //getTitulo()+"\n"+getAutor()+"\n"+getEditora();
		System.out.println(temp);
		try {
			cadastrar(temp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void cadastrar(String temp1)  throws IOException  {

		File arquivo = new File("Geral.txt"); 
		FileWriter fw = null;
		try {
			fw = new FileWriter(arquivo, true);
		} catch (IOException ex) {
			Logger.getLogger(Livro.class
					.getName()).log(Level.SEVERE, null, ex);
		}
		BufferedWriter bw = new BufferedWriter(fw);
		
		try {
			bw.write("Livros:");
			bw.newLine();

			bw.write(temp1);

			bw.newLine();

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
}
