package pacote;

import java.util.Scanner;

//Elaborar uma função que calcule o Máximo Divisor Comum entre dois números.
public class Ex54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a , b;
		System.out.println("Digite um numero: ");
		a = sc.nextInt();
		System.out.println("Digite um numero: ");
		b = sc.nextInt();
		
		int mdc = calcularMDC(a , b);
		System.out.println("Maximo divisor comum entre " + a + " e " + b + " é " + mdc);
		
		sc.close();
			}
	public static int calcularMDC(int a , int b) {
		while(b != 0 ) {
			int resto = a % b;
			a = b;
			b = resto;
		}
		return a;
	}
		}
	

