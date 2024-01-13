import java.util.Scanner;

public class Att14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicita ao usuário para informar a idade
        System.out.print("Digite a idade da pessoa: ");
        int idade = scan.nextInt();

        // Verifica se a pessoa pode votar (idade igual ou superior a 16 anos)
        if (idade >= 16) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Não pode votar.");
        }
    }
}
