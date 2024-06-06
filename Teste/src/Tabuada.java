import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			// O problema estava no calculo do número capturado do usuário e o calculo no laço de repetição
			// Pois o numero estava sendo dividido 
			System.out.println(num + " x " + i + " = " + (num * i)); 
		}
	}
}
