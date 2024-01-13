import java.util.Scanner;

public class Att01Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] vetor = new int[tamanhoVetor];

        // Preenchendo o vetor com 5 números
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scan.nextInt();
        }

        // Exibindo o vetor na ordem inversa
        System.out.println("\nVetor na ordem inversa:");

        for (int i = tamanhoVetor - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
