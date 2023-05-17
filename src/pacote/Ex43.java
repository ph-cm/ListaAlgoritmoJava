package pacote;

/* Criar um algoritmo que armazene dados em uma matriz de ordem 5 e imprima: toda a
matriz e a matriz gerada só com números ímpares.*/
public class Ex43 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		//MATRIZ DE ORDEM 5 ARMAZENADA
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				
				matriz[i][j] = i * 5 + j + 1;
			}
		}
			System.out.println("Matriz completa: ");
			for(int i = 0 ; i < matriz.length ; i++) {
				for(int j = 0 ; j < matriz.length ; j++) {
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
			
		//MATRIZ DOS NUMEROS IMPARES
		System.out.println("Matrizes com os números impares: ");
		for(int i = 0 ; i<matriz.length ; i++) {
			for(int j = 0 ; j < matriz.length ; j++) {
				if(matriz[i][j] % 2 != 0) {
					System.out.print(matriz[i][j] + " ");
				}

			}
		}
		}
		
	}

