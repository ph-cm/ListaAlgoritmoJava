package pacote;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data;
		int dia,mes,ano;
		
		System.out.println("Digite uma data dd/mm/aa:  ");
		data = sc.nextLine();
		
		
		dia = Integer.parseInt(data.substring(0 , 2));
		mes = Integer.parseInt(data.substring(2 , 4));
		ano = 2000 + Integer.parseInt(data.substring(4 , 6));
		
		System.out.println("Dia: " + dia);
		System.out.println("Mes: " + mes);
		System.out.println("Ano: " + ano);
		
		sc.close();
	}
}
