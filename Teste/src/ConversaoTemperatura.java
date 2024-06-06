import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius: ");

		// Adicionado um (Try Catch)
		// Assim o usuário não vai estourar erro caso digitar outro tipo de dado a não
		// ser números inteiros
		// Exceção InputMismatchException
		// Lançado por um Scanner para indicar que o tokenretrieved não corresponde ao
		// padrão
		// para o tipo esperado ou que o token está fora do intervalo para o tipo
		// esperado.
		try {
			double celsius = scanner.nextDouble();
			System.out.print("Deseja converter para Fahrenheit (F) ou Celsius (C)? ");
			char escolha = scanner.next().charAt(0);
			double resultado = 0;
			switch (escolha) {
			// Para tornar o código mais robusto foi adicionado que o programa aceite
			// entradas como 'f', 'F', 'c' ou 'C'.
			case 'f':
			case 'F':
				resultado = (celsius * 9 / 5) + 32;
				System.out.println("Temperatura em Fahrenheit: " + resultado);
				break;
			case 'c':
			case 'C':
				System.out.println("Temperatura em Celsius: " + celsius);
				break;
			default:
				System.out.println("Escolha inválida!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Por favor, insira um número válido.");
			scanner.next(); // limpar o buffer do scanner
		}
		
		// fechando o scanner
		scanner.close();

	}
}
