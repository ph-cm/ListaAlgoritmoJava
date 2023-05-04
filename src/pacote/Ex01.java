package pacote;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroCasa,dezenaCasa;
		
		System.out.println("Digite o número da sua casa(limite de 3 dígitos):");
		numeroCasa = sc.nextInt();
		
		dezenaCasa = (numeroCasa % 100)/10;
		
		System.out.println("A dezena da sua casa é: " + dezenaCasa);
		

	}

}
