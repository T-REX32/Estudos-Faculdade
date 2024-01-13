import java.util.Scanner;

public class Att08Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor];

        // Preenchendo o vetor A com 5 números
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorA[i] = scan.nextInt();
        }

        // Preenchendo o vetor B com 5 números
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorB[i] = scan.nextInt();
        }

        // Calculando a soma dos vetores A e B e preenchendo o vetor C
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        // Exibindo o vetor C (soma de A e B)
        System.out.println("Vetor C (soma de A e B):");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
