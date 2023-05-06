package pacote;

import java.util.Scanner;

//Entrar com um número e informar se ele é divisível ou não por 5.

public class Ex19 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Digite um número: ");
	numero = sc.nextInt();
	
	if ((numero % 5) == 0) {
			System.out.println("Esse número divisível por 5");
		}
		else {
			System.out.println("Esse número nao é divisível por 5");
		}
	}
}
