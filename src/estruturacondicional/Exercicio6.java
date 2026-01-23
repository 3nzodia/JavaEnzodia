/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*/
package estruturacondicional;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double valor=0;

		System.out.println("Digite o codigo do pedido , e logo em seguida a quantidade");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			 valor += 4 * quantidade;
			System.out.printf("Total: R$ %.2f", valor);
		}
		if (codigo == 2) {
			valor += 4.50 * quantidade;
			System.out.printf("Total: R$ %.2f",valor);
		}
		if (codigo == 3) {
			valor += 5 * quantidade;
			System.out.printf("Total: R$ %.2f",valor);
		}
		if (codigo == 4) {
			valor += 2 * quantidade;
			System.out.printf("Total: R$ %.2f",valor);
		}
		if (codigo == 5) {
			valor += 1.50 * quantidade;
			System.out.printf("Total: R$ %.2f",valor);
		}

	}

}
