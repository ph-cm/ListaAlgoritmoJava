package pacote;

import java.util.Scanner;

/*Criar um algoritmo que calcule o Máximo Divisor Comum entre dois números inteiros
lidos*/
public class Ex37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 , num2 , mdc;
		
		System.out.println("Escolha o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Escolha o segundo número: ");
		num2 = sc.nextInt();
		
		mdc = calcularMdc( num1 , num2);
		
		System.out.println("O MDC de " + num1 + " com " + num2 + " é " + mdc);
	}
	public static int calcularMdc(int num1 , int num2) {
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
}
