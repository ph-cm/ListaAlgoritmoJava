package pacote;

import java.util.Scanner;

//Criar um algoritmo que calcule e imprima a área de um Trapézio.
public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float baseMenor , baseMaior , altura ,areaTotal;
		
		System.out.println("Escolha a base menor: ");
		baseMenor = sc.nextFloat();
		
		System.out.println("Escolha a base maior: ");
		baseMaior = sc.nextFloat();
		
		System.out.println("Escolha a altura: ");
		altura = sc.nextFloat();
		
		areaTotal = ((baseMaior + baseMenor) * altura) / 2;
		
		System.out.println("Area do trapézio é: " + areaTotal);
		
		
	}
}
