import java.util.Scanner;

public class Att02_Estrutura_dados_Vetores {
    /*Crie um programa que leia 10 números inteiros e armazene-os em um vetor. Em seguida, exiba a soma de todos os números
do vetor*/
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int vetor[] = new int[tamanhoVetor];
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Informe o "+(i + 1)+" número: ");
            vetor[i] = scan.nextInt();
            soma += vetor[i];
        }
        System.out.println("Soma de todos os números: "+soma);
        
    }
}
