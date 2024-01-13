import java.util.Scanner;

public class Att12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();

        // Verifica se o número é múltiplo de 3 e de 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println(numero + " é múltiplo de 3 e de 5.");
        } else if (numero % 3 == 0) {
            System.out.println(numero + " é múltiplo de 3, mas não é múltiplo de 5.");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " é múltiplo de 5, mas não é múltiplo de 3.");
        } else {
            System.out.println(numero + " não é múltiplo de 3 nem de 5.");
        }

    }
}