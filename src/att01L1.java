import java.util.Scanner;
public class att01L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, media ,freq;

        System.out.println("Primeira nota: ");
        n1 = sc.nextInt();

        System.out.println("Segunda nota: ");
        n2 = sc.nextInt();

        System.out.println("Terceira nota: ");
        n3 = sc.nextInt();

        System.out.println("Informe a sua frequência nas aulas: ");
        freq = sc.nextInt();

        media = (n1 + n2 + n3) / 3;

        if (freq >= 75 && media >= 7) {
            System.out.println("Aprovado!");
        } else if (freq < 75 && media >= 7) {
            System.out.println("Reprovado por não ter a frequência de aulas exigidas!");
        } else if (freq >= 75 && media >= 5 && media < 7) {
            System.out.println("Pegou Exame!");
        } else if (freq < 75 && media >= 5 && media < 7) {
            System.out.println("Reprovado! Não importa se você tem direito a exame. Se você não participa pelo menos  75% das aulas, você é reprovado!");
        } else if (freq > 75 && media < 7) {
            System.out.println("Reprovado!");
        }
    }
}
