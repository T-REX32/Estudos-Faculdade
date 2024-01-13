import java.util.Scanner;

public class Att10Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];

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

        // Verificando se os vetores A e B são iguais
        boolean saoIguais = true;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetorA[i] != vetorB[i]) {
                saoIguais = false;
                break;
            }
        }

        // Exibindo o resultado da verificação
        if (saoIguais) {
            System.out.println("Os vetores A e B são iguais.");
        } else {
            System.out.println("Os vetores A e B não são iguais.");
        }
    }

}
