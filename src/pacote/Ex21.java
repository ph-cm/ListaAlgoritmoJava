package pacote;

import java.util.Scanner;

/*Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não é
divisível por nenhum destes.*/
public class Ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if ((numero % 10) == 0 && (numero % 5) == 0 && (numero % 2) == 0) {
			System.out.println("Esse número é divisível por 10,5 e 2");
		}
		else {
			System.out.println("Esse número não é divisível por 10,5 e 2");
		}
		sc.close();
	}
}
