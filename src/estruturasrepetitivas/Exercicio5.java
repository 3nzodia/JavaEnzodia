/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/

package estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int quadrado = Math.powExact(i, 2);
			int cubo = Math.powExact(i, 3);

			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		sc.close();
	}

}
