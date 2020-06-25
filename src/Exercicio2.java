import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numero = new int[N];

		for (int i = 0; i < N; i++) {
			numero[i] = sc.nextInt();
		}

		int contPares = 0;
		System.out.print("Numeros pares digitados: ");
		for (int i = 0; i < N; i++) {
			if (numero[i] % 2 == 0) {
				System.out.print(numero[i] + " ");
				contPares += 1;
			}
		}
		System.out.println();
		System.out.println("Total de numeros pares digitados: " + contPares);
		sc.close();
	}

}
