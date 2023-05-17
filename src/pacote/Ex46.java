package pacote;

import java.util.Scanner;

//Criar uma função que converta radianos para graus
public class Ex46 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		double radianos , graus;
		
		System.out.println("Digite os graus raidanos: ");
		radianos = sc.nextDouble();
		
		graus = radianos * (180 / Math.PI);
		
		System.out.println("Em graus é:" + graus);
		sc.close();
	}
}
