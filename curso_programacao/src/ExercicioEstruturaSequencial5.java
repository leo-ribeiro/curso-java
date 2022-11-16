import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaSequencial5 {

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc = sc.nextInt();
		int horasTrab = sc.nextInt();
		double valHoras = sc.nextDouble();
		double salario = (double) horasTrab * valHoras;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salario); 
		

		sc.close();
	}

}
