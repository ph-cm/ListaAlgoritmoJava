package pacote;

import java.util.Scanner;

/*Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 ou
menor do que 20.*/
public class Ex22 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero > 20) {
			System.out.println("O número é maior que 20");
		}
		else if(numero == 20) {
			System.out.println("O número é igual a 20");
		}
		else {
			System.out.println("O número é menor que 20");
		}
		sc.close();
	}
}
