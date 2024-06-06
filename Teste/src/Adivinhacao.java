import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1;
		int tentativas = 0;
		System.out.println("Bem-vindo ao jogo de adivinhação!");
		while (true) {
			System.out.print("Tente adivinhar o número (entre 1 e 100): ");
			try {
				int palpite = scanner.nextInt();
				tentativas++;
				if (palpite == numeroAleatorio) {
					System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
					break;
				} else if (palpite > numeroAleatorio) {
					System.out.println("Tente um número menor.");
				} else {
					System.out.println("Tente um número maior.");
				}
				
				// Adicionado um (Try Catch)
				// Assim o usuário não vai estourar erro caso digitar outro tipo de dado a não
				// ser números inteiros
				// Exceção InputMismatchException
				// Lançado por um Scanner para indicar que o tokenretrieved não corresponde ao
				// padrão
				// para o tipo esperado ou que o token está fora do intervalo para o tipo
				// esperado.

			} catch (InputMismatchException e) {
				System.out.println("Por favor, insira um número válido.");
				scanner.next(); // limpar o buffer do scanner
			}
		}
		// fechando o scanner
				scanner.close();
	}
}