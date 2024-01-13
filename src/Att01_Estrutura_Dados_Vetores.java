import java.util.Scanner;

public class Att01_Estrutura_Dados_Vetores {
    /*Crie um programa que leia 5 números do usuário e exiba a média
aritmética desses números. */
    public static void main(String[] args) {
        int TamanhoVetor = 5;
        int vetor[] = new int[TamanhoVetor];
        int media = 0;
        int soma = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < TamanhoVetor; i++) {
            System.out.println("Informe o "+(i+1)+" número: ");
            vetor[i] = scan.nextInt();
            soma += vetor[i];
        }
        media = soma / vetor.length;
        System.out.println("Sua média aritmética é: "+ media);
    }
}
