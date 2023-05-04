package pacote;

import java.util.Scanner;

public class Ex05 {
	//Ler um número e imprimir seu sucessor e seu antecessor. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero , antecessor , sucessor;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O número: " + numero + "\ntem o antecessor: " + antecessor + "\nsucessor: " + sucessor);
	
		sc.close();
	}
}
