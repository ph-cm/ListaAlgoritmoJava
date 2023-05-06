package pacote;

import java.util.Scanner;

// Ler um número e imprimir se ele é par ou ímpar
public class Ex17 {
	public static void main (String[]  args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Escolha um número: ");
		numero = sc.nextInt();
		
		if((numero % 2) == 0) {
			System.out.println("Este número é par");
		}else {
			System.out.println("Este número é impar");
		}
		sc.close();
	}
}
