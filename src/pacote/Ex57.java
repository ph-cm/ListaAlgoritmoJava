package pacote;
/*Criar uma função que receba um vetor de inteiro com 10 elementos e um elemento,
verifique se o elemento está no vetor*/
public class Ex57 {
	public static void main(String[] args) {
		int[] vetor = {1 , 3 , 6 , 8 , 12 , 4 , 9 , 43 , 13 ,17 };
		int elemento = 1;
		
		boolean resultado = verificarCondicao(vetor , elemento);
		if(resultado) {
			System.out.println("Está no vetor");
		}
		else {
			System.out.println("Não está no vetor");
		}
		
		}
	public static boolean verificarCondicao(int[] vetor , int elemento) {
		for(int i = 0 ; i < vetor.length ; i++) {
			if(vetor[i] == elemento) {
				return true;
			}
		}
		return false;
	}
}
