import java.sql.SQLOutput;
import java.util.Scanner;

public class Att02Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanhoVetor = 10, soma = 0;
        int vetor[] = new int [tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite o "+(i+1)+"º número: ");
            vetor[i] = scan.nextInt();
        }
        System.out.println("Soma dos valores: ");

        for (int i = 0; i < tamanhoVetor; i++){
            soma += vetor[i];
        }
        System.out.println("Soma dos valores do vetor: "+soma);
    }
}
