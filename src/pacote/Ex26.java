package pacote;

import java.util.Scanner;

//Efetuar a leitura de 5 números inteiros diferentes e identificar o maior e o menor
public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		
		for (int i = 1 ; i <= 5 ; i++) {
			int num;
			
			System.out.println("Escolha o " + i + " Numero: ");
			num = sc.nextInt();
			
			if (num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
		}
		System.out.println("Maior número é: "  + maior);
		System.out.println("Menor número é: " + menor);
		
		sc.close();
	}
}
