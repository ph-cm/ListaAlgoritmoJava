package pacote;

import java.util.Scanner;

/*Entrar com 20 números e imprimir a soma dos números cujos quadrados são menores
do que 225*/
public class Ex33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		for(int i = 1 ; i <= 20 ; i++) {
	
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			int quadrado = numero * numero;
			
			if(quadrado < 225) {
				soma += numero;
			}
		}
		
		System.out.println("Soma dos quadrados menores de 225 é: " + soma);
		sc.close();
	}
}
