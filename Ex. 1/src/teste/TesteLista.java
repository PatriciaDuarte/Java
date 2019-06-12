package teste;

public class TesteLista {
public static void main (String[] args)
{
        Lista l1= new Lista(10);
        l1.insere(5,6); // insere o valor 6 na posição 5
        l1.verValores();
        System.out.println();
        
        
        l1.insere(15,8); // sai dos limites do array
        l1.verValores();
        System.out.println();
        
        l1.insere(8,12,4);
        l1.verValores();   // retorna 3 na posição 8
        System.out.println();
        
        l1.insere(200,12,4); // sai dos limites do array
        l1.verValores();
        System.out.println();
        
        l1.insere(2,5,0); // divisao por zero no metodo insere
        l1.verValores(); 
        System.out.println();
}}