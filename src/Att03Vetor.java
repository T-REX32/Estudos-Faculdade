import java.util.Scanner;

public class Att03Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        // Preenchendo o vetor com 10 números
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scan.nextInt();
        }

        // Exibindo apenas os números pares do vetor
        System.out.println("Números pares do vetor:");

        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}