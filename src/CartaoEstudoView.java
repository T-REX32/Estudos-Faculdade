import java.util.Scanner;
import java.util.ArrayList;

public class CartaoEstudoView {

    /*private CadastroCartaoController controller = new CadastroCartaoController();
    private Scanner leitor;

    public CartaoEstudoView(Scanner leitor) {
        this.leitor = leitor;
    }

    public void MostrarMenu() {
        int opcao = -1;
        System.out.println("MENU");

        while (opcao != 5) {
            System.out.println("1 - Cadastrar cartão");
            System.out.println("2 - Pesquisar cartão buscando pelo seu número");
            System.out.println("3 - Pesquisar cartão buscando pela frase armazenada dentro dele");
            System.out.println("4 - Mostrar todos os dados de cada cartão.");
            System.out.println("5 - Sair");
            opcao = Integer.parseInt(leitor.nextLine());
            trataOpcao(opcao);
        }
    }

    public void trataOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarCartao();
                break;

            case 2:
                listarPorNumeroCartao();
                break;

            case 3:
                listarPorPalavraCartao();
                break;

            case 4:
                mostrarTodosCartoes();
                break;

            default:
                break;
        }
    }

    public void cadastrarCartao() {
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println("CADASTRAR CARTÃO");
        System.out.println("-=-=-=-=-=-=-=-=");

        System.out.println("Informe número do cartão: ");
        int numeroCartao = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe a palavra em inglês: ");
        String palavrainglesCartao = leitor.nextLine();

        controller.cadastrar(numeroCartao, palavrainglesCartao);
    }

    public void listarPorPalavraCartao() {
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println("LISTANDO POR PALAVRAS EM INGLÊS");
        ArrayList<Cartao> cartoes = controller.buscarPalavraCartao(leitor.nextLine());
        for (Cartao cartao : cartoes) {
            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
            System.out.println("Palavra em Inglês: " + cartao.getPalavraingles());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

    public void listarPorNumeroCartao() {
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println("LISTANDO POR NUMERO DOS CARTÕES");
        ArrayList<Cartao> cartoes = controller.buscarPorNumeroCartao(Integer.parseInt(leitor.nextLine()));
        for (Cartao cartao : cartoes) {
            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());1

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

    public void mostrarTodosCartoes() {
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println("LISTANDO TODOS OS CARTÕES");
        ArrayList<Cartao> cartoes = controller.trazerTodos();
        for (Cartao cartao : cartoes) {
            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
            System.out.println("Palavra em Inglês: " + cartao.getPalavraingles());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }*/
}
