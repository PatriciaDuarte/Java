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

public class Midia extends Publicações{

	private String tipo;
	public Midia() {
		
	}
	
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	@Override
	public void entrada(){
		String temp="";

		setTipo(JOptionPane.showInputDialog("MIDIAS\nO tipo de MIDIA: "));
		setTitulo(JOptionPane.showInputDialog("MIDIAS\nO titulo que deseja: "));
		setAutor(JOptionPane.showInputDialog("MIDIAS\nO nome do artista: "));
		setEditora(JOptionPane.showInputDialog("MIDIAS\nO nome da Editora: "));
		setEdição(Integer.parseInt(JOptionPane.showInputDialog("MIDIAS\nO numero da edição: ")));
		setNumchamada(Integer.parseInt(JOptionPane.showInputDialog("MIDIAS\nO numero da Chamada: ")));
		temp= "MIDIAS\nTIPO: "+getTipo()+"||TITULO: "+getTitulo()+"||ARTISTA: "+getAutor()+"||GRAVADORA: "+getEditora()+
				"||EDIÇÂO: "+String.valueOf(getEdição())+"||NUMERO DE CHAMADA: "+String.valueOf(getNumchamada());
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
