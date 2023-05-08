package pacote;

import java.util.Scanner;

/*Criar um algoritmo que leia um número que será o limite superior de um intervalo e o
incremento (incr). Imprimir todos os números naturais no intervalo de 0 até esse
número. Suponha que os dois números lidos são maiores do que zero*/
public class Ex31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int limite , incr;
		
		System.out.println("Escolha um limite: ");
		limite = sc.nextInt();
		
		System.out.println("Escolha o incremento");
		incr = sc.nextInt();
		
		for(int i = 0 ; i <= limite ; i += incr) {
			System.out.println(i);
		}
		sc.close();
	}
}
