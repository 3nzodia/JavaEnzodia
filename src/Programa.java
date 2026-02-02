

import java.util.Locale;
import java.util.Scanner;

import entities.employe.Employee;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// instanciação
		Employee employee = new Employee();
		Locale.setDefault(Locale.US);
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		employee.tax = sc.nextDouble();

		System.out.println("Employee:" + employee.name +", $" + employee.netSalary());
		
		System.out.println("Which percentage to increase salary?");
		double percentage=sc.nextDouble();
		employee.increaseSalary(percentage);
		
		
		System.out.println("Update data: "+employee.name+ ", $ "+employee.netSalary()) ;
		
		sc.close();
	}	

}
