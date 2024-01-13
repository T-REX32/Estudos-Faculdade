import java.util.Scanner;
public class att04L1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, crescente;

        System.out.println("Digite um número: ");
        n1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        n2 = scan.nextInt();

        if (n1 > n2){
            System.out.println("n2 = "+n2+", n1 = "+n1+".");
        }
        else {
            System.out.println("n1 = "+n1+", n2 = "+n2+".");
        }
    }
}
