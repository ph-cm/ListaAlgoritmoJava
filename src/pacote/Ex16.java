package pacote;

import java.util.Scanner;

/*Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição.
Caso o resultado seja maior que 10, apresenta-lo.*/
public class Ex16 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 , num2 , soma;
		
		System.out.println("Escolha um número: ");
		num1 = sc.nextInt();
				
		System.out.println("Escolha outro número: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		if(soma >= 10) {
			System.out.println("Soma maior que 10 , soma igual a: " + soma);
		}else {
			System.out.println("Soma menor que 10 , soma igual a " + soma);
		}
	}
}
