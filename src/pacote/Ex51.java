package pacote;

import java.util.Scanner;

//Elabore uma função que coloque três números em ordem crescente
public class Ex51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 , num2 , num3;
		
		
		System.out.println("Digite um número:");
		num1 = sc.nextInt();
		System.out.println("Digite um número:");
		num2 = sc.nextInt();
		System.out.println("Digite um número:");
		num3 = sc.nextInt();
		
		int[] numerosOrdenados = ordemCrescente(num1 , num2 , num3);
		
		System.out.println("A ordem crescente dos números é: " + numerosOrdenados[0] + " " + numerosOrdenados[1] + " " + numerosOrdenados[2]);
		
		
		sc.close();
	}
	public static int[] ordemCrescente(int num1 , int num2 , int num3) {
		int[] numeros = {num1 , num2 , num3};
		for(int i = 0 ; i < numeros.length - 1 ; i++ ) {
			for(int j = i + 1 ; j < numeros.length ; j++) {
				if(numeros[i] > numeros[j]) {
					int temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
		return numeros;
	}
}
