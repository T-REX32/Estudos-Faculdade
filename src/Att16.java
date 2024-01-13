import java.util.Scanner;

public class Att16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        // Apresenta a mensagem no console
        if (primo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
