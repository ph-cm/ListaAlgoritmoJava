package pacote;

import java.util.Scanner;

/*Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é
múltiplo de 3*/
public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroMultiplo;
		
		System.out.println("Escolha um número: ");
		numeroMultiplo = sc.nextInt();
		
		if((numeroMultiplo % 3) == 0 ) {
			System.out.println("O número é multiplo de 3");
		}
		else {
			System.out.println("O número não é multiplo de 3");
		}
		
		sc.close();
	}
}
