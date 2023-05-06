package pacote;

import java.util.Scanner;

//Entrar com dois números e imprimi-los em ordem decrescente
public class Ex25 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num1 , num2;
		
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
		
		if(num1 < num2) {
			System.out.println(num1 + " " + num2);
		}
		else {
			System.out.println(num2 + " " + num1);
		}
		sc.close();
	}
}
