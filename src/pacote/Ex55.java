package pacote;
/*Criar uma função que receba um vetor de inteiros e seu tamanho e retorne o menor
dos elementos do vetor.*/
public class Ex55 {
	public static void main(String[] args) {
		int[] vetor = {4 , 6 , 3 , 8 , 5 , 9};
		
		int menorNumero = encontrarMenorNumero(vetor);
		System.out.println("O menor numero do vetor é " + menorNumero);
	}
	
	public static int encontrarMenorNumero(int[] vetor) {
		int menor = Integer.MAX_VALUE;
		for(int i = 1 ; i < vetor.length ; i++) {
			if(vetor[i] < menor) {//menor vai atualizar qual o menor numero da lista a cada loop
				menor = vetor[i];
			}
		}
		return menor;
	}
}
