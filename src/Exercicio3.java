import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numero = new int[N];
		int[] numeroA = new int[N];
		int[] numeroB = new int[N];
		
		for (int a = 0; a < N; a++) {
			numeroA[a] = sc.nextInt();
		}
		
		for (int b = 0; b < N; b++) {
			numeroB[b] = sc.nextInt();
		}
		
		for (int c = 0; c < N; c++) {
			numero[c] = numeroA[c] + numeroB[c];
		System.out.print(numero[c] + " ");
		}
		
		sc.close();
	}

}
