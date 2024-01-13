import java.util.Scanner;

public class Att04Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        // Preenchendo o vetor com 10 números
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scan.nextInt();
        }

        // Inicializando as variáveis para o maior e o menor valor
        int maior = vetor[0];
        int menor = vetor[0];

        // Encontrando o maior e o menor valor do vetor
        for (int i = 1; i < tamanhoVetor; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Exibindo o maior e o menor valor do vetor
        System.out.println("O maior valor do vetor é: " + maior);
        System.out.println("O menor valor do vetor é: " + menor);
    }
}