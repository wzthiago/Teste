import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = scanner.nextInt();
		
		// Não permite que o usuário faça a entrada de números negativos
		if (num < 0) {
			System.out.println("Número inválido. Por favor, digite um número não negativo.");
		} else {
		
			int fatorial = 1;
			for (int i = 1; i <= num; i++) {
				fatorial *= i; // Corrigido
			}
			System.out.println("Fatorial de " + num + " = " + fatorial);
		}
		// fechando o scanner
		scanner.close();
	}
}
