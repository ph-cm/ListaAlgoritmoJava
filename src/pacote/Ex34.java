package pacote;

import java.util.Scanner;

/*Ler vários números até entrar o número -999. Para cada número, imprimir seus
divisores*/

public class Ex34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Digite um número e para sair da operação digite -999: ");
			numero = sc.nextInt();
			
			if(numero != -999) {
				for(int i = 1 ; i <= numero ; i++) {
					if(numero % i == 0){
						System.out.println("Os divisores desse número são: " + i);
					}
				}
			}
		}while(numero != -999);
		sc.close();
	}
}
