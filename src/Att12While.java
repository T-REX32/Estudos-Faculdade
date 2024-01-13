import java.util.Scanner;

public class Att12While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        int numero;

        do {
            System.out.println("Digite um número entre 2 e 10: ");
            numero = scan.nextInt();

            if (numero < 2 || numero > 10) {
                System.out.println("Número inválido! Informe um número entre 2 e 10.");
            }
        } while (numero < 2 || numero > 10);

        for (int i = 0; i < numero; i++) {
            System.out.println(nome);
        }
    }
}
