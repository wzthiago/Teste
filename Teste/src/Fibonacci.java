import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência Fibonacci: ");
        int n = scanner.nextInt();

        // Adicionada uma verificação para garantir que o usuário insira um número positivo. 
        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else {
            System.out.print("Sequência Fibonacci: ");
            int primeiroTermo = 0, segundoTermo = 1;
            
            // A lógica da geração da sequência está correta, 
            // onde primeiroTermo e segundoTermo são atualizados iterativamente para gerar a sequência Fibonacci.
            for (int i = 1; i <= n; i++) {
                System.out.print(primeiroTermo + " ");
                int proximoTermo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
            System.out.println(); // Adicionar uma quebra de linha após a sequência
        }
        
        scanner.close(); // Fechar o scanner
    }
}