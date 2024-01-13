import java.util.Scanner;

public class Att18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o ano
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        // Verifica se o ano é bissexto e apresenta a mensagem no console
        boolean bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}
