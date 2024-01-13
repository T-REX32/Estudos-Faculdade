import java.util.Scanner;

public class Att13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe se está aprovado (true/false): ");
        boolean aprovado = scan.nextBoolean();

        // Verifica se a pessoa está aprovada ou não e apresenta a mensagem no console
        if (aprovado) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
