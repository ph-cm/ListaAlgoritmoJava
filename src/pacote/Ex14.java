package pacote;

import java.util.Scanner;

public class Ex14 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num , primeiro , segundo , terceiro , quarto , inverso;
		
		System.out.println("Digite um número de 4 algarismos: ");
		num = sc.nextInt();
		
		primeiro = (num / 1000);
		segundo = ((num % 1000 )/ 100) * 10;
		terceiro = ((num % 100) / 10) * 100;
		quarto = (num % 10) * 1000;
		
		inverso = primeiro + segundo + terceiro + quarto;
		System.out.println("O inverso de " + num + " é " + inverso);
		sc.close();
	}
}
