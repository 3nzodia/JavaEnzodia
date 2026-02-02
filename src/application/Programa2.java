package application;

import java.util.Locale;
import java.util.Scanner;

import entitiesStudy.Student;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// instanciação!
		Student student = new Student();
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		System.out.println("FINAL GRADE = "+ String.format("%.2f",student.media()));
		student.resultadoAprovação();
		
		sc.close();

	}

}
