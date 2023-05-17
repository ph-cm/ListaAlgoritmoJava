package pacote;

import java.util.Scanner;

/*Um número capicua é uma sequência de algarismos que permanece a mesma se lida
na ordem direta ou inversa. Por exemplo o ano 2002 é um ano capicua. 12321 também
é um número capicua. Porém 123 não é capicua pois lido da direita para a esquerda,
torna 321 e é diferente de 123. Elabore uma função que verifique essa característica.*/
public class Ex50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero , aux;
		
		System.out.println("Digite um número para verificar se é capicua:");
		numero = sc.nextInt();
		
		aux = reverso(numero);
		
		System.out.println("Numero: " + numero + " \nReverso: " + aux);
		if(aux == numero) {
			System.out.println("É capicua");
		}
		else {
			System.out.println("Não é capicua");
		}
		sc.close();
	}
	public static int reverso(int numero){
		int soma = 0 , resto;
		while(numero != 0) {
			resto = numero % 10;
    		soma = (soma * 10)  + resto;
    		numero = numero / 10;
		}
		return soma;
	}
}


