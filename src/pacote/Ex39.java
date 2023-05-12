package pacote;

import java.util.Scanner;

/*Fazer um algoritmo para ler um conjunto de 100 números reais e informar:
a. Quantos números lidos são iguais a 30.
b. Quantos são maiores que a média.
c. Quantos são iguais à média.*/

public class Ex39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		int contador = 0, contadorMedia = 0 , contadorMediaIgual = 0;
		double media;
		int soma = 0;
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println("Escolha um número: ");
			num[i] = sc.nextInt();
			soma += num[i]; 
			media = (double) soma / num.length;
			
			if(num[i] == 30) {
				contador++;
			}
			if(media < num[i]) {
				contadorMedia ++;
			}
			else if(media == num[i]) {
				contadorMediaIgual++;
			}
		}
		System.out.println("a)- São " + contador + " numeros '30'");
		System.out.println("b)- São " + contadorMedia + " numeros maiores que a média");
		System.out.println("c)- São " + contadorMediaIgual + " numeros iguais a média");
	
		sc.close();
	}
}
