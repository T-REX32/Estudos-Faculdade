import java.util.Scanner;

public class Att06While {
    public static void main(String[] args) {
        //Escreva um programa que solicite 10 números e em seguida apresente o menor número
        //digitado.
        int num, contador = 0, MenorNum = Integer.MAX_VALUE;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            if (num < MenorNum) {
                MenorNum = num;

            }
            contador++;
        } while (contador < 10);
        System.out.println("O menor número é: "+MenorNum);
    }
}
