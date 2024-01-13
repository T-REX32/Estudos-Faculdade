import java.util.Scanner;
public class att02L1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fumAnos, qtFumDia, qtFum1Ano, qtTotalFumTodosAnos;
        float precoCigarro, precoUnitarioCigarro, precoTotalGastoCigarro;
        System.out.println("Informe por quantos anos você está fumando:");
        fumAnos = scan.nextInt();

        System.out.println("Informe a quantidade de cigarros que você fuma por dia: ");
        qtFumDia = scan.nextInt();

        System.out.println("Informe o preço do cigarro: ");
        precoCigarro = scan.nextInt();

        qtFum1Ano = qtFumDia * 365;
        qtTotalFumTodosAnos = qtFum1Ano * fumAnos;

        precoUnitarioCigarro = 10 / precoCigarro;
        precoTotalGastoCigarro = precoUnitarioCigarro * qtTotalFumTodosAnos;

        System.out.println("Você fumou "+qtTotalFumTodosAnos+" cigarros em "+fumAnos+" anos. E gastou R$"+precoTotalGastoCigarro+" nesses "+fumAnos+" anos que você fumou.");


    }
}
