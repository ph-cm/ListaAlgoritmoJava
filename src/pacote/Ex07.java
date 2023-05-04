package pacote;

import java.util.Scanner;

public class Ex07 {
	//Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante, cossecante e cotangente deste ângulo
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double angulo , seno , cosseno , tangente , secante , cossecante , cotangente;
		
		System.out.println("Escolha um angulo: ");
		angulo = sc.nextDouble();
		
		seno = Math.sin(angulo);
		cosseno = Math.cos(angulo);
		tangente = Math.tan(angulo);
		secante = 1/cosseno;
		cossecante = 1/seno;
		cotangente = 1/tangente;
		
		System.out.println("Seno: " + seno);
		System.out.println("Cosseno: " + cosseno);
		System.out.println("Tangente: " + tangente);
		System.out.println("Secante" + secante);
		System.out.println("Cossecante: " + cossecante);
		System.out.println("Cotangente: " + cotangente);
	
		sc.close();
	}
}
