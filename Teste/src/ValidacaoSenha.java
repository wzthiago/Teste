import java.util.Scanner;

public class ValidacaoSenha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		String senha = scanner.nextLine();
		if (senha.length() >= 8 && senha.matches(".*[A-Z].*") && senha.matches(".*[a-z].*")
				&& senha.matches(".*[0-9].*")) {
			System.out.println("Senha válida!");
		} else {
			System.out.println(
					"Senha inválida! A senha deve conter pelo menos 8 caracteres, incluindo letras maiúsculas, minúsculas e números.");
		}
	}
}