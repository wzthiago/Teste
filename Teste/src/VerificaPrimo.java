import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        boolean primo = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo && num != 1)
            System.out.println(num + " é primo.");
        else
            System.out.println(num + " não é primo.");
    }
}
