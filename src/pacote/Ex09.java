package pacote;

import java.util.Scanner;

public class Ex09 {
	//Entrar com a base e a altura de um retângulo e imprimir o perímetro, área e a diagonal.
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura , base , perimetro , area;
		double diagonal;
		
		System.out.println("Digite uma valor para a base do retangulo: ");
		base = sc.nextInt();
		
		System.out.println("Digite um valor para a altura do retangulo: ");
		altura = sc.nextInt();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt((base*base) + (altura * altura));
		
		System.out.println("Área: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Diagonal: " + diagonal);

	}
}
