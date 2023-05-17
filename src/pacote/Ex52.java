package pacote;
//Elabore uma função que coloque três números em ordem decrescente.
public class Ex52 {
	public static void main(String[] args) {
		int a = 4;
		int b = 8;
		int c = 2;
		
		int[] ordemNumeros = ordemDecrescente(a , b , c);
		
		System.out.println("A ordem decrescente é " + ordemNumeros[0] + " " + ordemNumeros[1] + " " + ordemNumeros[2]);
	}
	public static int[] ordemDecrescente(int a ,int b ,int c) {
		int[] numeros = {a , b ,c};
		
		int j = 0;
		for(int i =  0 ; i < numeros.length - 1 ; i++) {
			for(j = i + 1 ; j < numeros.length  ; j++) {
				if(numeros[j] > numeros[i]) {
				int temp = numeros[j];
				numeros[j] = numeros[i];
				numeros[i] = temp;
				}
			}
		}
		
		return numeros;
	}
}
