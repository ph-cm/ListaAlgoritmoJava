package pacote;

import java.util.Scanner;

//Criar uma função que verifique se um número é primo.
public class Ex47 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int numero;
		boolean primo = true;
		
		System.out.println("---VERIFICAÇÃO DE NUMERO PRIMO---");
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero <= 1) {
			primo = false;
		}
		for(int i = 2 ; i <= Math.sqrt(numero) ; i++) {
			if(numero % i == 0) {
				primo = false;
				break;
			}
		}
		if(primo == true) {
			System.out.println("É primo");
		}
		else {
			System.out.println("Não é primo");
		}
		sc.close();
	}
}
