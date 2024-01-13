import java.util.Scanner;

public class Att06Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 8;
        int[] vetor = new int[tamanhoVetor];
        int quantidadeNegativos = 0;

        // Preenchendo o vetor com 8 números
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scan.nextInt();
            if (vetor[i] < 0) {
                quantidadeNegativos++;
            }
        }

        // Exibindo a quantidade de elementos negativos
        System.out.println("Quantidade de elementos negativos: " + quantidadeNegativos);
    }
}
