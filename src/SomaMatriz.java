import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        int matriz[][] = new int [5][5];
        int soma = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int n = 0; n < matriz.length; n++) {
                System.out.println("Informe o "+(n+1)+"° número: ");
                matriz[i][n] = scan.nextInt();
                soma += matriz[i][n];
            }
            System.out.println("Soma total: "+ soma);
        }
    }
}
