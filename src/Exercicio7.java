import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nome = new String[N];
		double[] notaA = new double[N];
		double[] notaB = new double[N];
		double media;
		String aprovados = null;
		
		for (int i = 0; i < N; i++) {
			nome[i] = sc.next();
			notaA[i] = sc.nextDouble();
			notaB[i] = sc.nextDouble();			
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < N; i++) {
			media = (notaA[i] + notaB[i])/2;
			if(media >= 6) {
				aprovados = nome[i];
				System.out.println(aprovados);
			}
		}
		sc.close();
	}

}
