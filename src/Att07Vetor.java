import java.util.Scanner;

public class Att07Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor * 2];

        // Preenchendo o vetor A com 5 números
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
        }

        // Preenchendo o vetor B com 5 números
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorB[i] = scan.nextInt();
            vetorC[tamanhoVetor + i] = vetorB[i];
        }

        // Exibindo o vetor C (concatenação de A e B)
        System.out.println("Vetor C (concatenação de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
