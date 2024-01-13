import java.util.Scanner;
public class att04L2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salBruto, salLiquido;

        System.out.println("Informe seu salário Bruto: ");
        salBruto = scan.nextFloat();

        if (salBruto < 2000){
            salLiquido = salBruto - (salBruto * 10 / 100);
            System.out.println("Você tem menos que 2000 reais de salário bruto, então descontamos 10% dele.");
            System.out.println("Salário Líquido: "+salLiquido);
        }
        else {
            salLiquido = salBruto - (salBruto * 20 / 100);
            System.out.println("Você tem mais que 2000 de salário bruto, ou tem o mesmo valor. Então descontamos 20% dele.");
            System.out.println("Salário Líquido: "+salLiquido);
        }
    }
}
