import java.util.Scanner;

public class Att09Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] vetor = new int[tamanhoVetor];

        // Preenchendo o vetor com 5 números
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scan.nextInt();
        }

        // Ordenando o vetor em ordem crescente
        for (int i = 0; i < tamanhoVetor - 1; i++) {
            for (int j = i + 1; j < tamanhoVetor; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        // Exibindo o vetor ordenado
        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}