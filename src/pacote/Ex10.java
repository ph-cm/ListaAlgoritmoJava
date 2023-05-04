package pacote;

import java.util.Scanner;

public class Ex10 {
	//Criar um algoritmo que calcule e imprima a área de um triângulo
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base , altura , area;
		
		System.out.println("Escolha a base do trinagulo: ");
		base = sc.nextInt();
		
		System.out.println("Escolha a altura do triangulo: ");
		altura = sc.nextInt();
		
		area = (base * altura) / 2;
		System.out.println("A área do triangulo é : " + area);
	}
}
