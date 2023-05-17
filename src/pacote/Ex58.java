package pacote;

public class Ex58 {
	public static void main(String[] args) {
		int[] vetor1 = {1 , 2 , 3 , 4 ,5};
		int[] vetor2 = {5 , 4 , 3, 2 , 1};
		
		int resultado1 = verificarCondicaoDecrescente(vetor1 , vetor1.length);
		int resultado2 = verificarCondicaoDecrescente(vetor2 , vetor2.length);
		
		if(resultado1 == 1) {
			System.out.println("Vetor em ordem decrescente");
		}
		else {
			System.out.println("Vetor nao está em ordem decrescente");
		}
		if(resultado2 == 1) {
			System.out.println("Vetor em ordem decrescente");
		}
		else {
			System.out.println("Vetor nao está em ordem decrescente");
		}
	}
	public static int verificarCondicaoDecrescente(int[] vetor , int tamanho) {
		for(int i = 0 ; i < tamanho - 1; i++) {
			if(vetor[i] < vetor[i + 1]) {
				return 0;
			}
			
		}
		return 1;
	}
}
