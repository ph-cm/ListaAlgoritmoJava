package pacote;

import java.util.Scanner;

/*Ler um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o usuário
digite um número fora desse intervalo, deverá aparecer uma mensagem informando
que não existe mês com o número informado*/
public class Ex28 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o número do mês: ");
		numero = sc.nextInt();
		
		if(numero >= 1 && numero <= 12) {
			if(numero == 1) {
				System.out.println("Janeiro");
			}
			if(numero == 2) {
				System.out.println("Fevereiro");
			}
			if(numero == 3) {
				System.out.println("Março");
			}
			if(numero == 4) {
				System.out.println("Abril");
			}
			if(numero == 5) {
				System.out.println("Maio");
			}
			if(numero == 6) {
				System.out.println("Junho");
			}
			if(numero == 7) {
				System.out.println("Julho");
			}
			if(numero == 8) {
				System.out.println("Agosto");
			}
			if(numero == 9) {
				System.out.println("Setembro");
			}
			if(numero == 10) {
				System.out.println("Outubro");
			}
			if(numero == 11) {
				System.out.println("Novembro");
			}
			if(numero == 12) {
				System.out.println("Dezembro");
			}
		}else {
			System.out.println("(Número inválido)\nNão há nenhum mês com essa numeração");
		}
		sc.close();
	}
}
