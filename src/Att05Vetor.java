import java.util.Scanner;

public class Att05Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 6;
        int[] vetor = new int[tamanhoVetor];
        int soma = 0;

        // Preenchendo o vetor com 6 números
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scan.nextInt();
            soma += vetor[i];
        }

        // Calculando a média aritmética
        double media = (double) soma / tamanhoVetor;

        // Exibindo os elementos maiores que a média
        System.out.println("\nElementos maiores que a média:");

        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }
}