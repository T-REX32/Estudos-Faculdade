import java.util.Scanner;

public class appEstudando {
    public static void main(String[] args) {
        Estudando bala = new Estudando();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        bala.setNome(scan.nextLine());

        System.out.println("Informe sua idade: ");
        bala.setIdade(scan.nextInt());

        bala.setReginstrar_Vendas();

        System.out.println("A soma dos valores da venda é: "+ bala.getSoma_total_Vendas());
    }
}
