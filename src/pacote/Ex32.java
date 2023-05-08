package pacote;
//Criar um algoritmo que imprima a soma dos números pares entre 25 e 200.
public class Ex32 {
	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 26 ; i <= 200 ; i += 2) {
			System.out.println(i);
			soma += i;
		}
		System.out.println("Soma dos termos: " + soma);
		
	}
}
