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

public class Revista extends Publicações {
	private String manchete;
	
	public Revista() {
		
		
	}
	
	public String getManchete(){
		return manchete;
	}
	public void setManchete(String man){
		this.manchete = man;
	}
	
	@Override
	public void entrada(){
		String temp="";

		setTitulo(JOptionPane.showInputDialog("REVISTA\nO titulo que deseja: "));
		setManchete(JOptionPane.showInputDialog("\nREVISTA\nA manchete: "));
		setEditora(JOptionPane.showInputDialog("O \nREVISTA\nNome da Editora: "));
		setEdição(Integer.parseInt(JOptionPane.showInputDialog("REVISTA\nO numero da edição: ")));
		setNumchamada(Integer.parseInt(JOptionPane.showInputDialog("REVISTA\nO numero da Chamada: ")));
		temp= "REVISTA:\nOBRA: "+getTitulo()+"||MANCHETE: "+getManchete()+"||EDITORA: "+getEditora()+"||EDIÇÂO: "
				+String.valueOf(getEdição())+"||NUMERO DE CHAMADA: "+String.valueOf(getNumchamada());
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
