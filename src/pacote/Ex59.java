package pacote;

import java.util.Scanner;

/*Faça um algoritmo que receba o tamanho dos três lados de um triângulo e faça as
seguintes atividades:
• Retornar se os três lados realmente formam um triângulo
• Qual é o tipo de triângulo (isósceles, Escaleno ou Equilátero)
• Calcular o perímetro do triângulo*/
public class Ex59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado1 , lado2 , lado3;
		
		System.out.println("Digite um lado do triangulo: ");
		lado1 = sc.nextInt();
		System.out.println("Digite um lado do triangulo: ");
		lado2 = sc.nextInt();
		System.out.println("Digite um lado do triangulo: ");
		lado3 = sc.nextInt();
		
		boolean condicao = verificarCondicaoDeExistencia(lado1 , lado2 , lado3);
		if(condicao == true) {
			System.out.println("O tringulo pode ser feito");
		}
		else {
			System.out.println("O triangulo não pode ser feito");
		}
		
		int triangulo = tipoDoTriangulo(lado1 , lado2 , lado3);
		
		if(triangulo == 1) {
			System.out.println("Triangulo escaleno");
		}
		else if(triangulo == 2) {
			System.out.println("Triangulo issoceles");
		}
		else if(triangulo == 3) {
			System.out.println("Triangulo equilatero");
		}
		int perimetro = calcularPerimetro(lado1 , lado2 , lado3);
		System.out.println("Perímetro do triangulo é: " + perimetro);
		
		sc.close();
	}
	public static boolean verificarCondicaoDeExistencia(int l1 , int l2 , int l3) {
		if(l1 > l2 + l3) {
			return false;
		}
		else if(l2 > l1 + l3) {
			return false;
		}else if(l3 > l1 + l2) {
		return false;
		}else {
			return true;
		}
	}
	public static int tipoDoTriangulo(int l1 , int l2 ,int l3) {
		if (l1 != l2 && l1 != l3 && l2 != l3) {
			return 1;
		}
		else if(l1 == l2 && l1 != l3 || l1 == l3 && l1 != l2 || l2 == l3 && l2 != l1) {
			return 2;
		}
		else if(l1 == l2 && l1 == l3 && l2 ==l3) {
			return 3;
		}
		return 0;
	}
	public static int calcularPerimetro(int l1 , int l2 , int l3) {
		int calculo =  l1 + l2 + l3;
		return calculo;
	}
}
