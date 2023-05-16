package pacote;

import java.util.Arrays;
import java.util.Scanner;

/*Criar um algoritmo que leia dois vetores A e B, contendo, cada um, 25 elementos
inteiros: Intercale esses dois conjuntos (A[1]/B[1]/A[2]/B[2]...) formando um vetor V de
50 elementos. Ordene de forma decrescente. Imprima o vetor V.*/
public class Ex40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[25];
		int[] B = new int[25];
		int[] V = new int[50];
		
		System.out.println("Digite os números do vetor A:");
		for(int i = 0 ; i < A.length ; i++ ) {
		A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os números do vetor B:");
		for(int i = 0 ; i < B.length ; i++) {
			B[i] = sc.nextInt();
		}
		int j =0;
		for(int i = 0 ; i < 25 ; i++) {
			V[j++] = A[i];
			V[j++] = B[i];
		}
		Arrays.sort(V); 
		System.out.println("Vetor V: ");
		for(int i = 0; i <= 49 ; i++) {
			System.out.println(  V[i]);
		}
		
		sc.close();
	}
}
