import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] numero = new double[N];

		for (int i = 0; i < N; i++) {
			numero[i] = sc.nextDouble();
		}
		
		double soma = 0.0, media = 0.0;
		int cont = 0;
		for (int i = 0; i < N; i++) {
			if (numero[i] % 2 == 0) {
				soma += numero[i];
				cont += 1;
				media = soma / cont;
			}
		}
		System.out.println("Media dos valores pares: " + media);
		sc.close();
		

	}

}
