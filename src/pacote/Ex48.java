package pacote;

import java.util.Scanner;

//Criar uma função que verifique se um número é par.
public class Ex48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean par;
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par");
		}
		else {
			System.out.println("O número " + numero + " não é par");
		}
		sc.close();
	}
}
