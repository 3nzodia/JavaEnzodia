package estruturasrepetitivas;

import java.util.Scanner;

public class ExercicioExtraFinaleira {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int z = 0;
		int in = 0;
		int out = 0;
		for (int i = 0; i < N; i++) {
			z = sc.nextInt();
			if (z >= 10 && z <= 20)
				in += 1;

			else
				out += 1;

		}
		System.out.printf("%d in%n",in);
		System.out.printf("%d out",out);
		
		sc.close();
	}
}