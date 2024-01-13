import java.util.Scanner;

public class Att10While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um número entre 2 e 5: ");
            numero = scan.nextInt();
        } while (numero < 2 || numero > 5);

        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
