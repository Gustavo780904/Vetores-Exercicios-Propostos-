import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] mercadoria = new String[N];
		double[] compra = new double[N], venda = new double[N];

		for (int i = 0; i < N; i++) {
			mercadoria[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}
		int lucroAbaixo = 0, lucroEntre = 0, lucroAcima = 0;
		double lucroTotal = 0.0, totalCompra = 0.0, totalVenda = 0.0, calcPercentual = 0.0;

		for (int i = 0; i < N; i++) {
			calcPercentual = (venda[i] - compra[i]) / compra[i];

			if (calcPercentual < 0.10) {
				lucroAbaixo++;
			} else if (calcPercentual <= 0.20) {
				lucroEntre++;
			} else {
				lucroAcima++;
			}
		}
		for (int i = 0; i < N; i++) {
			totalCompra += compra[i];
			totalVenda += venda[i];
			lucroTotal += venda[i] - compra[i];
		}
		System.out.println("Lucro abaixo de 10%: " + lucroAbaixo);
		System.out.println("Lucro entre 10%% e 20%: " + lucroEntre);
		System.out.println("Lucro acima de 20%: " + lucroAcima);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);
		
		sc.close();
	}

}
