import java.util.Scanner;

public class Calculadora1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		System.out.print("Digite a operação (+, -, *, /): ");
		char operacao = scanner.next().charAt(0);
		double resultado = 0;
		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			// O erro estava ocorrendo porque estava multiplicando num1 por num2 em vez de
			// subtrair.
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operação inválida!");
		}
		System.out.println("Resultado: " + resultado);

		// fechando o scanner
		scanner.close();
	}

}
