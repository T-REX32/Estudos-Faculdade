import java.util.Scanner;

public class Att21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar os três números inteiros
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Ordena os três números em ordem crescente
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero2 > numero3) {
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;

            if (numero1 > numero2) {
                temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
        }

        // Apresenta os números ordenados no console
        System.out.println("Números ordenados em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
    }
}
