import java.util.Scanner;

public class Att15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar os três lados do triângulo
        System.out.print("Digite o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();

        System.out.print("Digite o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();

        System.out.print("Digite o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();

        // Verifica se é possível formar um triângulo com os lados informados
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("É possível formar um triângulo com esses lados.");
        } else {
            System.out.println("Não é possível formar um triângulo com esses lados.");
        }
    }
}
