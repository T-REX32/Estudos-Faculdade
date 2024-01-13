import java.util.ArrayList;

public class RepositorioCartao {

    private static ArrayList<Cartao> cartoes = new ArrayList<>();

    public void encaixar(Cartao cartao) {
        cartoes.add(cartao);
    }

    public ArrayList<Cartao> listaCartoes() {
        return cartoes;
    }

    public ArrayList<Cartao> listarPorNumero(int numeroCartao) {
        ArrayList<Cartao> listado = new ArrayList<>();

        for (Cartao cartao : cartoes) {
            listado.add(cartao);
        }

        return listado;
    }

    public ArrayList<Cartao> listarPorPalavra(String palavraCartao) {
        ArrayList<Cartao> listado = new ArrayList<>();
        for (Cartao cartao : cartoes) {
            if(cartao.getPalavraingles().toLowerCase().startsWith(palavraCartao)) {
                listado.add(cartao);
            }
        }
        return listado;
    }
}
