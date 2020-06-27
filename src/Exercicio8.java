import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] altura = new double[N];
		char[] sexo = new char[N];

		for (int i = 0; i < N; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		double maior = 0.0, menor = Integer.MAX_VALUE, media = 0.0, somaAlt = 0;
		int contM = 0, contF = 0;

		for (int i = 0; i < N; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		for (int i = 0; i < N; i++) {
			if (sexo[i] == 'M' || sexo[i] == 'm') {
				contM++;
			} else {
				contF++;
				somaAlt += altura[i]; 
				media = somaAlt / contF;
			}
		}
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + contM);
		
		sc.close();
	}

}
