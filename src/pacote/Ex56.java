package pacote;
/*Criar uma função que receba um vetor de inteiros e seu tamanho e retorne o maior
dos elementos do vetor*/
public class Ex56 {
	public static void main(String[] args) {
		int[] vetor = {8 , 9 , 4 , 6 , 2 , 22};
		
		int maiorNumero = encontrarMaiorNumero(vetor);
		System.out.println("O maior numero do vetor é: " + maiorNumero);
	}
	public static int encontrarMaiorNumero(int[] vetor) {
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		return maior;
	}
}
