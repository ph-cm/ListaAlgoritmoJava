package pacote;

import java.util.Scanner;

public class Ex13 {
/*Criar um algoritmo que receba um número real, calcular e imprimir: 
 * (i) a parte inteira do numero,
 * (ii) a parte fracionaria do numero e o 
 * (iii) numero arredondado
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero , fracao , numeroInteiro;
		int   numeroArredondado;
		
		System.out.println("Escolha um numero: ");
		numero = sc.nextDouble();
		
		fracao = ((numero * 10) % 10 ) /10;
	
		System.out.println("Fração: " + fracao);
		
		numeroInteiro = numero - fracao;
		System.out.println("Inteiro: " + numeroInteiro);
		
		numeroArredondado = (int) Math.ceil(numero);
		System.out.println("Arredondado: " + numeroArredondado);
		sc.close();	
	}
}
