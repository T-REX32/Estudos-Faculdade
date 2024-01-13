import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe seu nome:");
        aluno.getNome(scan.nextLine());
        System.out.println("Informe sua primeira nota: ");
        aluno.setN1(scan.nextDouble());

        System.out.println("Informe sua segunda nota: ");
        aluno.setN2(scan.nextDouble());

        System.out.println("Informe sua terceira nota: ");
        aluno.setN3(scan.nextDouble());

        aluno.setMedia();
        System.out.println("Sua média final é: "+aluno.getMedia());
    }
}
