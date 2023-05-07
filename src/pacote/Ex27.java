package pacote;

import java.util.Scanner;

//Ler três números e verificar se eles podem ou não formar lados de um triângulo.
public class Ex27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado1 , lado2 , lado3;
		
		System.out.println("Verificação de triangulo");
		System.out.println("Digite o primeiro lado: ");
		lado1 = sc.nextInt();
		
		System.out.println("Digite o segundo lado: ");
		lado2 = sc.nextInt();
		
		System.out.println("Digite o terceiro lado: ");
		lado3 = sc.nextInt();
		
		if(lado1 > (lado2 + lado3)) {
			System.out.println("Não é possível formar um triângulo");
		}
		if(lado2 > (lado1 + lado3)) {
			System.out.println("Não é possível formar um triângulo");
		}
		if(lado3 > (lado1 + lado2)) {
			System.out.println("Não é possível formar um triângulo");
		}else {
			System.out.println("É possivel formar um triangulo!!");
		}
		sc.close();
	}
}
