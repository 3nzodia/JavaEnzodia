package estruturacondicional;

import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class Exercicio5 {

	public static void main(String[] args) {
		int horainicial;
		int horafinal;
		int duracao;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora inicial do jogo");
		horainicial = sc.nextInt();
		System.out.println("Digite  a hora final do jogo ");
		horafinal = sc.nextInt();

		if (horainicial < horafinal) {
			duracao = horafinal - horainicial;
		} else {
			duracao = 24 - horainicial + horafinal;
		}
		System.out.println("O jogo durou " + duracao +"Horas(S)");

		sc.close();
	}

}
