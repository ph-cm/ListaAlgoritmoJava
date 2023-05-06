package pacote;

import java.util.Scanner;

//Entrar com dois números e imprimir o maior número
public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 , num2;
		
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
		}
		else if(num1 < num2) {
			System.out.println(num1 + " é menor que " + num2 );
		}
		sc.close();
	}
}
