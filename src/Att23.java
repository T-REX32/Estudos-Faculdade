import java.util.Random;
import java.util.Scanner;

public class Att23 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar o palpite do usuário
        int palpite;

        // Inicia o loop de adivinhação
        do {
            // Solicita ao usuário para fazer um palpite
            System.out.print("Tente adivinhar o número (entre 1 e 100): ");
            palpite = scanner.nextInt();

            // Verifica se o palpite é maior, menor ou igual ao número aleatório
            if (palpite > numeroAleatorio) {
                System.out.println("Dica: o número é menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Dica: o número é maior.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
            }
        } while (palpite != numeroAleatorio);
    }
}
