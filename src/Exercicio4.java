import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] numero = new double[N];

		for (int i = 0; i < N; i++) {
			numero[i] = sc.nextDouble();
		}

		double media = 0, soma = 0;
		
		for (int i = 0; i < N; i++) {
			soma += numero[i];
			media = soma / N;	
		}
		System.out.printf("A média aritimética dos valores é: %.3f%n", media);
		System.out.print("Valores abaixo da média: ");
		for (int i = 0; i < N; i++) {
			if (numero[i] < media) {
				System.out.print(numero[i] + " ");
			}
		}

		sc.close();
	}

}
