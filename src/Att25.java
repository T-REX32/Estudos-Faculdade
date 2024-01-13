import java.util.Scanner;

public class Att25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcula a representação binária do número e a exibe no console
        String binario = "";
        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                int digito = numero % 2;
                binario = digito + binario;
                numero /= 2;
            }
        }

        System.out.println("Número binário: " + binario);
    }
}
