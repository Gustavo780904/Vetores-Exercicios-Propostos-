import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] numero = new double[N];
		
		for (int i=0; i<N; i++) {
			numero[i] = sc.nextDouble();
		}
		
		double maior = Integer.MIN_VALUE;
		int indiceMaior = -1;
		
		for (int i=0; i < N; i++) {
			if (numero[i] > maior) {
				maior = numero[i];
				indiceMaior = i;
			}
		}
		System.out.printf("O maior número é %.1f e ocupa a posição %d.%n", maior, indiceMaior);
		sc.close();

	}

}
