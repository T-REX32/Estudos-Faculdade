import java.util.Scanner;

public class Att17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o caractere
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        // Converte o caractere para letra minúscula para facilitar a verificação
        char letraMinuscula = Character.toLowerCase(caractere);

        // Verifica se o caractere é uma vogal ou uma consoante e apresenta a mensagem no console
        if (letraMinuscula >= 'a' && letraMinuscula <= 'z') {
            if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
                System.out.println(caractere + " é uma vogal.");
            } else {
                System.out.println(caractere + " é uma consoante.");
            }
        } else {
            System.out.println(caractere + " não é uma letra válida.");
        }
    }
}
