package Biblioteca;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {

		int opc1, opc2 = 0, sair;
		String in="Geral.txt";
		do{
			do{
				opc1 = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer:\n[1]Cadastrar novo item.\n[2]Busca por item."+
						"\n[3]Listar todos os itens.\n[4]Sair."));
				if((opc1 < 1) || (opc1 > 4)){
					JOptionPane.showMessageDialog(null, "ENTRADA INVALIDA TENTE NOVAMENTE!!!");
				}
			}while((opc1 < 1) || (opc1 > 4));

			if(opc1 == 1){
				do{
					opc2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo do item desejado:\n[1]Livros.\n[2]Revistas.\n[3]Midias"));
					if((opc2 < 1)||(opc2 > 3)){
						JOptionPane.showMessageDialog(null, "ENTRADA INVALIDA TENTE NOVAMENTE!!!");
					}
				}while((opc2 < 1)||(opc2 > 3));
			}
			
			Livro livro = new Livro();
			Revista revista = new Revista();
			Midia midia = new Midia();	
			Publicações pub = new Publicações();
			
			switch(opc1){
			case 1:
				if(opc2 == 1){
					livro.entrada();
				}else{
					if(opc2==2){
						revista.entrada();
					}else{
						midia.entrada();
					}
				}
				break;
			case 2:
				pub.busca(in);
				break;
			case 3:
				pub.listar(in);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Obrigado por usar nossa biblioteca");
				break;
			}	
			sair = Integer.parseInt(JOptionPane.showInputDialog("Aperte ok pra sair ou digite 1.\nPARA CONTINUAR digite outro numero."));
		}while(sair != 1);
	}

}
