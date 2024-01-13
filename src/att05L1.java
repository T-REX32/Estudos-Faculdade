import java.util.Scanner;
public class att05L1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o primerio número: ");
        a = scan.nextByte();

        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        System.out.println("Digite o terceiro número: ");
        c = scan.nextInt();

        if (a>b && a>c){
            System.out.println("O maior valor digitado é "+a+".");
        }
        else{
            if(b >a && b>c) {
                System.out.println("O maior valor digitado é "+b+".");

            }
            else {
                System.out.println("O maior número digitado é "+c+".");
            }
        }
    }
}