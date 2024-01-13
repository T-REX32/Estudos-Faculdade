import java.util.ArrayList;

public class CadastroCartaoController {
    private RepositorioCartao repositorioCartao = new RepositorioCartao();

    public void cadastrar(int numeroCartao, String palavraIngles) {
        Cartao cartao = new Cartao(numeroCartao, palavraIngles);
        repositorioCartao.encaixar(cartao);
    }

    public ArrayList<Cartao> trazerTodos() {
        return repositorioCartao.listaCartoes();
    }

    public ArrayList<Cartao> buscarPorNumeroCartao (int numeroCartao) {
        return  repositorioCartao.listarPorNumero(numeroCartao);
    }

    public ArrayList<Cartao> buscarPalavraCartao (String palavraCartao){
        return repositorioCartao.listarPorPalavra(palavraCartao);
    }
}
