package pacote;

import java.util.Scanner;

/*Entrar com valores para uma matriz . Gerar e imprimir a . A matriz transposta é gerada
trocando linha por coluna.*/

public class Ex44 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[2][2];
		int[][] matrizTransposta = new int[2][2];
		
		System.out.println("Digite o valor da matriz 5x5:");
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz.length ; j++) {
				System.out.print("Escreva o elemento da posição ( " + i + " , " + j + "):");
				matriz[i][j] = sc.nextInt();
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
		}
		System.out.println("\nMatriz transposta: ");
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
                System.out.print(matrizTransposta[i][j] + " ");
            }
		}
       sc.close();
		}
		
		
	
	}

