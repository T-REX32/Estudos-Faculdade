import java.util.Scanner;

public class att05L2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float percursoKM, litrosKm;
        String tipoCarro;
        System.out.println("Informe quais dos carros você escolheu (A, B ou C): ");
        tipoCarro = scan.nextLine();

        System.out.println("Informe quantos Km você percorreu com o carro: ");
        percursoKM = scan.nextInt();

        if (tipoCarro.equals("A")) {
            litrosKm = percursoKM / 8;
            System.out.println("Você consumiu "+litrosKm+" Litros, pois o carro tipo A faz 8km.");
        }
        else{
            if (tipoCarro.equals("B")){
                litrosKm = percursoKM / 9;
                System.out.println("Você consumiu "+litrosKm+" Litros, pois o carro tipo B faz 9km.");
            }
            else {
                if (tipoCarro.equals("C")){
                    litrosKm  = percursoKM / 12;
                    System.out.println("Você consumiu "+litrosKm+" Litros, pois o carro tipo C faz 12km.");
                }
                else {
                    System.out.println("Você deve inserir somente os carros A, B ou C! E precisa escrever em letra maiúscula!");
                }
            }
        }
    }
}

