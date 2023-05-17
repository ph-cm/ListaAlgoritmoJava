package pacote;

import java.util.Scanner;

//Elaborar uma função que converta um número da base 10 para a base 2.
public class Ex53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroDecimal;
		System.out.println("Digite um número para ser transformado em binário: ");
		numeroDecimal = sc.nextInt();
		
		String numeroBinario = transformacaoBinario(numeroDecimal);
		System.out.println("O numero " + numeroDecimal + " em binário é " + numeroBinario);
		
		sc.close();
	}
	public static String transformacaoBinario(int decimal) {
		StringBuilder binario = new StringBuilder();
		
		if(decimal == 0) {
			binario.append("0");
		}
		while(decimal > 0) {
			int resto = decimal % 2;
			binario.insert(0 , resto);
			decimal /= 2;
		}
		return binario.toString();
	}
}
