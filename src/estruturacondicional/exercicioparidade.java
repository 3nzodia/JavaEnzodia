package estruturacondicional;

import java.util.Scanner;

public class exercicioparidade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("escreva um numero para saber sua paridade ");

		int numero = sc.nextInt();
		if (numero % 2 == 0)
			System.out.println("é par");
		
		else 
		System.out.println("é impar!");

	}

}
