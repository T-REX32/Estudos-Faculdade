import java.util.Scanner;

public class Att24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcula a soma dos dígitos do número
        int somaDigitos = 0;
        while (numero != 0) {
            int digito = numero % 10;
            somaDigitos += digito;
            numero /= 10;
        }

        // Apresenta o resultado no console
        System.out.println("A soma dos dígitos do número é: " + somaDigitos);

    }
}
