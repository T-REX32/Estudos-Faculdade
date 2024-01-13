public class Att09While {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1, cont = 0; cont < 50; i += 2, cont++) {
            soma += i;
        }

        System.out.println("A soma dos primeiros 50 números inteiros ímpares é: " + soma);
    }
}
