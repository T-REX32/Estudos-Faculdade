import java.util.Scanner;

public class att03L1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float precoFabrica, impostoRF, lucro, precoTotalparaConsumidor;
        System.out.println("Informe o preço de fábrica do carro: ");
        precoFabrica = scan.nextFloat();

        impostoRF = precoFabrica * 45 / 100;
        lucro = precoFabrica * 12 / 100;

        precoTotalparaConsumidor = precoFabrica + impostoRF + lucro;

        System.out.println("Preço total do carro para o consumidor: "+precoTotalparaConsumidor+"\n");
        System.out.println("impsoto a RF: "+impostoRF+"\n");
        System.out.println("lucro para a distribuidora: "+lucro+"\n");
    }
}






