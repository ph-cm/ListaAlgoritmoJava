package pacote;

import java.util.Scanner;

public class Ex08 {
	//Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprimir o novo saldo, considerando o reajuste de 1%

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo , reajuste;
		
		System.out.println("Digite seu saldo de aplicação: ");
		saldo = sc.nextDouble();
		
		reajuste = (saldo * 1/100) + saldo ;
		
		System.out.println("Seu reajuste é: " + reajuste);
	}
}
