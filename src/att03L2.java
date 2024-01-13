import java.util.Scanner;

public class att03L2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Eleitores, votosCanditadomaisVotado;
        String Muncipio;

        System.out.println("Informe o nome do município: ");
        Muncipio = scan.nextLine();

        System.out.println("Informe a quantidade de eleitores: ");
        Eleitores = scan.nextInt();

        System.out.println("Quantidade de votos do candidato mais votado: ");
        votosCanditadomaisVotado = scan.nextInt();

        if (Eleitores > 200000 && votosCanditadomaisVotado < (Eleitores / 2)) {
            System.out.println("Terá Segundo turno para votar, pois o candidato do município de "+Muncipio+" conseguiu "+votosCanditadomaisVotado+" votos.");
        } else {
            System.out.println("Não terá segundo turno, pois o candidato mais votado no município de "+Muncipio+" conseguiu somente "+votosCanditadomaisVotado+" votos.");
        }

    }
}