import java.util.Scanner;

public class Att22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o caractere
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        // Verifica se o caractere é uma letra maiúscula, minúscula ou um número
        if (Character.isUpperCase(caractere)) {
            System.out.println("O caractere é uma letra maiúscula.");
        } else if (Character.isLowerCase(caractere)) {
            System.out.println("O caractere é uma letra minúscula.");
        } else if (Character.isDigit(caractere)) {
            System.out.println("O caractere é um número.");
        } else {
            System.out.println("O caractere não é uma letra nem um número.");
        }
    }
}
