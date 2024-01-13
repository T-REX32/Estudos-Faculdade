import java.util.Scanner;

public class Att10 {
    public static void main(String[] args) {

        double raioCirculo, area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        raioCirculo = scan.nextDouble();

        area = Math.PI * raioCirculo * raioCirculo;

        System.out.println("A área do círculo é: " + area);
    }
}
