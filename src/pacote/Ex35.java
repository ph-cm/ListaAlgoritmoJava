package pacote;
/*Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 3
centímetros por ano. Construir um algoritmo que calcule e imprima quantos anos
serão necessários para que Juca seja maior que chico.*/
public class Ex35 {
	public static void main(String[] args) {
		double chico = 1.5;
		double juca = 1.1;
		int ano = 1;
		
		for(int i = ano ; chico >= juca ; i++ ) {
			chico = chico + 0.02;
			juca = juca + 0.03;
			System.out.println("Altura do chico é " + chico + " no ano " + i);
			System.out.println("Altura do juca é " + juca + " no ano " + i);
		}
		
	}
}
