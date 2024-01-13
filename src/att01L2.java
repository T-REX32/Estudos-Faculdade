import java.util.Scanner;

public class att01L2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valorVenda, valorCompra;

        System.out.println("Informe o valor da compra: ");
        valorCompra = scan.nextFloat();

        if (valorCompra < 200) {
            valorVenda = valorCompra + (valorCompra * 50 /100);
        }
        else {
            valorVenda = valorCompra + (valorCompra * 30 / 100);
        }

        System.out.println("Valor da final da venda: "+valorVenda);

    }
}