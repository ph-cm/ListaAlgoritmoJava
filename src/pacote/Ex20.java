package pacote;

import java.util.Scanner;

//Entrar com um número e informar se ele é divisível por 3 e por 7.
public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if ((numero % 3) == 0 && (numero % 7) == 0) {
			System.out.println("Esse número é divisivel por 3 e por 7");
		}
		else {
			System.out.println("Esse número não é divisível por 3 e por 7");
		}
		sc.close();
	}
}
