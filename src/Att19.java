import java.util.Scanner;

public class Att19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Converte o número para uma sequência de caracteres
        String numeroString = String.valueOf(numero);

        // Verifica se o número é um palíndromo e apresenta a mensagem no console
        boolean ehPalindromo = true;
        int tamanho = numeroString.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (numeroString.charAt(i) != numeroString.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println(numero + " é um palíndromo.");
        } else {
            System.out.println(numero + " não é um palíndromo.");
        }
    }
}
