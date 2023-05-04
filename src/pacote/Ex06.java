package pacote;

import java.util.Scanner;

public class Ex06 {
	// Ler dois números inteiros e imprimir a soma. Antes do resultado imprimir a mensagem: Soma
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 , n2 , soma;
		
		System.out.println("Digite um número:");
		n1 = sc.nextInt();
		
		System.out.println("Digite outro número:");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		System.out.println("A soma de " + n1 + " e " + n2 + " é " + soma);
	
		sc.close();
	}
}
