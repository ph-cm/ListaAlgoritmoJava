package pacote;

import java.util.Scanner;

/*Criar um algoritmo que leia uma matriz 5 x 5 inteira e apresente uma determinada
linha da matriz, solicitada via teclado*/
public class Ex45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[5][5];
		int linha;
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.println("Escolha o elemento da posição (" + i + " , " + j + "):");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite o número da linha que voce deseja consultar: ");
		linha = sc.nextInt();
		
		if(linha >= 0 && linha < 5) {
			System.out.print("Linha  " + linha + ":\n");
			for(int j = 0 ; j < 5 ; j++) {
				System.out.println(matriz[linha][j]);
			}
			
		}
		else {
			System.out.println("Linha inválida");
		}
		sc.close();
	}
}
