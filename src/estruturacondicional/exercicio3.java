package estruturacondicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um numero para sabermos se ele é negativo ou nao ");
		int x = sc.nextInt();
		if ( x >= 0)
			System.out.println("é positivo");
		else {
			System.out.println("é negativo.");
		}

	}

}
