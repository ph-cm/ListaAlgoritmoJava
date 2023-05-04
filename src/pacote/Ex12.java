package pacote;

import java.util.Scanner;

public class Ex12 {
/*Criar um algoritmo que leia um valor de hora e informar 
	quantos minutos se passaram desde o início do dia*/
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int hora , minutos , totalMinutos;
	
	System.out.println("Digite a hora atual: ");
	hora = sc.nextInt();
	
	System.out.println("Digite os minutos atuais: ");
	minutos = sc.nextInt();
	
	totalMinutos = (hora * 60) + minutos;
	System.out.println("Os minutos que passaram do dia são: " + totalMinutos);
	
	sc.close();
	}
}
