package pacote;

import java.util.Scanner;

/*Criar o algoritmo que possa entrar com o nome do produto e o valor de compra, e imprimir o
nome do produto e valor da venda*/
public class Ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeDoProduto;
		Double valorDaCompra ,valorDaVenda , lucroSobreProduto;
		
		System.out.println("Digite o nome do produto: ");
		nomeDoProduto = sc.nextLine();
		
		System.out.println("Digite o valor de compra: ");
		valorDaCompra = sc.nextDouble();
		
		if(valorDaCompra < 10) {
			lucroSobreProduto = 0.7;
			
		}
		if(valorDaCompra >= 10 && valorDaCompra < 30) {
			lucroSobreProduto = 0.5;
			
		}
		if(valorDaCompra >= 30 && valorDaCompra < 50) {
			lucroSobreProduto = 0.4;
			
		}
		else {
			lucroSobreProduto = 0.3;
			
		}
		valorDaVenda = valorDaCompra * (1 + lucroSobreProduto);
		
		System.out.println("Nome do produto: " + nomeDoProduto);
		System.out.println("Valor de venda: " + valorDaVenda);
		
		sc.close();
	}
}
