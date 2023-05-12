package pacote;

import java.util.Scanner;

/*Entrar com números inteiros em um vetor A[50]. Gerar e imprimir o vetor B onde cada
elemento é o quadrado do elemento, na respectiva posição, do vetor A*/
public class Ex38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[50];//declara um vetor e seu tamanho
		int[] B = new int[50];//vai pegar cada numero do vetorA e elevar ao quadrado
		
		//ENTRAR COM OS NUMEROS DE A
		for(int i = 0 ; i < A.length ; i++) {
			System.out.println("Entre com um valor para o vetor A: ");
			A[i] = sc.nextInt();
		}
		//PEGAR OS NUMERO DO VETOR B
		for(int i = 0 ; i < A.length ; i++) {
			B[i] = A[i] * A[i];
		}
		//IMPRIMIR OS VETORES 
		System.out.println("Vetores: ");
		for(int i = 0 ; i < A.length ; i++) {
			System.out.println(A[i] + " seu quadrado é " + B[i]);
		}
		sc.close();
	}
}
