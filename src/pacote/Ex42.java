package pacote;

import java.util.Scanner;

/*Criar um algoritmo que leia os elementos de matriz inteira 10 x 10 e escreva o produto
dos elementos que estão abaixo da diagonal principal.*/
public class Ex42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] [] matriz = new int[10][10];
		int produto;
		System.out.println("Digite os elementos da matriz: ");
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++ ) {
				System.out.print("Digite o elemento da posição (" + i +" , " + j +"):");
				matriz [i][j] = sc.nextInt();
			}
		}
		
		produto = 1;
		for(int i = 1 ; i < 10 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				if(i != j) {
					System.out.println("numeros utilizados" + matriz[i][j]);
					produto *= matriz[i][j]; 
				}
			}
		}
		System.out.println("O produto dos elementos que estão abaixo da diagonal da matriz é: " + produto);
		sc.close();
	}
}