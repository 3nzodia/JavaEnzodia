/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
*/
package estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int contaAlcool = 0;
		int contaGasolina = 0;
		int contaDiesel = 0;
		int x = sc.nextInt();
		while (x != 4) {
			if (x == 1)
				contaAlcool += 1;
			else if (x == 2)
				contaGasolina += 1;
			else if (x == 3)
				contaGasolina += 1;

			x=sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n",contaAlcool);
		System.out.printf("Gasolina: %d%n",contaGasolina);
		System.out.printf("Dielse: %d%n",contaDiesel);
		sc.close();
	}

}
