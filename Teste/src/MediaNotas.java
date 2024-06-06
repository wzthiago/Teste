import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantas notas deseja informar? ");
		int quantidade = scanner.nextInt();
		double soma = 0;
		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Digite a nota " + i + ": ");
			double nota = scanner.nextDouble();
			soma += nota;
		}
		// O erro estava no calculo da média, antes de corrigir estava adicionando 10 à
		// média das notas
		double media = soma / quantidade;
		System.out.println("Média das notas: " + media);
		
		   scanner.close(); // Fechar o scanner
	}
}
