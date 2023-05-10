package pacote;

import java.util.Scanner;

//Entrar com um número e verificar se ele é um número primo
public class Ex36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		boolean primo = true;
		
		if(numero < 1 ) {
			primo = false;
		}
		else {
			for(int i = 2 ; i <= Math.sqrt(numero) ; i++) {
				if(numero % i == 0) {
					primo = false;
					break;
				}
			}
		}
		if(primo) {
			System.out.println("É primo");
		}
		else {
			System.out.println("Não é primo");
		}
		sc.close();
	}
}
