package pacote;

import java.util.Scanner;

/*Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da
pessoa. Obs. Verifique se o ano de nascimento é um ano válido*/ 
public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anoDeNascimento , idade;
		
		System.out.println("Digite o ano do seu nascimento: ");
		anoDeNascimento = sc.nextInt();
		
		if(anoDeNascimento <= 2023 && anoDeNascimento > 1910) {
			idade = 2023 - anoDeNascimento;
			System.out.println("Sua idade é: " + idade);
		}
		else {
			System.out.println("Data inválida");
		}
		sc.close();
	}
}
