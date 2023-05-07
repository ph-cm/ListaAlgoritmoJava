package pacote;

import java.util.Scanner;

//- Entrar com 10 números e imprimir a metade de cada número
public class Ex30 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <= 10 ; i++) {
			System.out.println("Digite um número: ");
			double numero = sc.nextDouble();
			double metade = numero / 2;
			System.out.println("A metade do ´numero " + numero + " é " + metade);
			
		}
		sc.close();
	}

}
