import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Insira seu nome: ");
        banco.setNome(scan.nextLine());

        System.out.println("Infome seu CNPJ: ");
        banco.setCnpj(scan.nextInt());

        System.out.println("Quantidade que você tem de saldo: ");
        banco.setSaldo(scan.nextDouble());

        System.out.println("Quantidade para depositar: ");
        banco.setDepositar(scan.nextDouble());

        System.out.println("Quantidade de saldo no seu banco: "+banco.getSaldo());
    }
}