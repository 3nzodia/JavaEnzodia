package entitiesStudy;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return nota1 + nota2+ nota3;
		
	}
	public void resultadoAprovação() {
		if (media()<60)
			System.out.println("FAILED\nMISSING "+ String.format("%.2f", 60.0 - media()) + " POINTS");
		else 
			System.out.println("PASS");
		
	}
	
}
