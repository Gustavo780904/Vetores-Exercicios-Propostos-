import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nome = new String[N];
		int[] idade = new int[N];
		int maiorIdade = 0;
		String maisAntigo = null;
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o nome: ");
			nome[i] = sc.next();
			System.out.print("Digite a idade: ");
			idade[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				maisAntigo = nome[i];
			}

		}
		System.out.println("O mais antigo é o (a): " + maisAntigo);

		sc.close();

	}

}
