import java.util.Scanner;

public class ExercicioEstruturaCondicionalApostila2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N < 0) {
			System.out.println("Este n�mero � NEGATIVO!");
		}
		else {
			System.out.println("Este n�mero � POSITIVO!");
		}
		
		sc.close();

	}

}
