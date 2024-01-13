import java.util.Scanner;

public class Att11While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros = 20;
        int numero;
        int soma = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int numerosValidos = 0;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            do {
                System.out.println("Digite o número " + i + ": ");
                numero = scan.nextInt();

                if (numero <= 0) {
                    System.out.println("Número inválido! Informe um número inteiro maior que zero.");
                }
            } while (numero <= 0);

            // Atualiza o menor e o maior número
            menor = Math.min(menor, numero);
            maior = Math.max(maior, numero);

            soma += numero;
            numerosValidos++;
        }

        double media = (double) soma / numerosValidos;

        System.out.println("Menor número digitado: " + menor);
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Média dos números digitados: " + media);
    }
}
