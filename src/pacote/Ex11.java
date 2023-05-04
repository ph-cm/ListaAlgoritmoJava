package pacote;

import java.util.Scanner;

public class Ex11 {
//Fazer um algoritmo que leia o valor gasto de uma pessoa em um restaurante, e imprimir o valor total com a gorjeta de 10%
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double conta , total ;
		
		System.out.println("Valor da conta: ");
		conta = sc.nextDouble();
		
		total = (conta * 10 /100) + conta;
		System.out.println("Total a ser pago: " + total + "\n(contando os 10% da gorjeta");
		
	}
}
