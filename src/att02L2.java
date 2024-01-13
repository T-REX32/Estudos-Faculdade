import java.util.Scanner;
public class att02L2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float l1, l2, l3;

        System.out.println("Digite o tamanho do primeiro lado do Triângulo: ");
        l1 = scan.nextInt();

        System.out.println("Digite o tamanho do segundo lado do Triângulo: ");
        l2 = scan.nextInt();

        System.out.println("Digite o tamanho do terceiro lado do Triângulo: ");
        l3 = scan.nextInt();

        if (l1 == l2 && l2 == l3) {
            System.out.println("O triângulo é um equilátero.");
        } else {
            if (l1 == l2 && l2 != l3 || l1 != l2 && l2 == l3 || l1 != l2 && l1 == l3) {
                System.out.println("O triângulo é um isóceles.");
            } else {
                if (l1 != l2 && l2 != l3 || l1 != l2 && l1 != l3) {
                    System.out.println("O triângulo é um escaleno.");
                }
            }
        }
    }
}
