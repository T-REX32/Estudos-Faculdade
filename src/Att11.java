import java.util.Scanner;

public class Att11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicita ao usuário para inserir o nome
        System.out.print("Digite o nome da pessoa: ");
        String nome = scan.nextLine();

        // Solicita ao usuário para inserir a altura em metros
        System.out.print("Digite a altura em metros: ");
        double altura = scan.nextDouble();

        // Solicita ao usuário para inserir o peso em quilogramas
        System.out.print("Digite o peso em quilogramas: ");
        double peso = scan.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Apresenta o resultado no console
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " quilogramas");
        System.out.println("IMC: " + imc);
    }
}
