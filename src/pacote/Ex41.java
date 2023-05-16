package pacote;

import java.util.Scanner;

/*Criar um algoritmo que leia um vetor de 30 números inteiros e imprima o número de
elementos da maior sublista ordenada crescentemente*/
public class Ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[10];
		int temp = 1 , maiorSub = 1 , i;
		boolean marcador = false;
		
		//PREENCHER A LISTA	
		for(i = 0 ; i < list.length ; i++ ) {
			System.out.print("Digite o número " + (i + 1)  + "° da lista: ");
			list[i] = sc.nextInt();
		}
		
		
		for(i = 0 ; i < 9 ; i++) {
			if(list[i + 1] > list[i]) {
				temp ++;
			}
			else if(maiorSub > temp) {
				maiorSub = temp;
				temp = 1;
				marcador = true;
			}
			else {
				temp = 1;
			}
		}
		if(!marcador) {
				maiorSub = temp;
			}
		
		
		System.out.println("Imprimindo um vetor: ");
		for(i = 0 ; i < list.length ; i++) {
			System.out.print("[" + list[i] + "]");
		}
		System.out.println("Na maior sublista tem " + maiorSub + " elementos");
		sc.close();
	}
	
}
