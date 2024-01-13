import java.util.Scanner;

public class Att20 {
    public static void main(String[] args) {
            // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário para informar o salário do funcionário
            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();

            // Calcula o aumento com base nas faixas de aumento
            double aumento;
            if (salario <= 1500) {
                aumento = salario * 0.15;
            } else {
                aumento = salario * 0.10;
            }

            // Calcula o novo salário com o aumento
            double novoSalario = salario + aumento;

            // Apresenta o novo salário no console
            System.out.println("Novo salário: R$ " + novoSalario);
    }
}
