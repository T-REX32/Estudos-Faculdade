public class Cartao {
    private int numeroCartao;
    private String palavraIngles;

    public Cartao(int numeroCartao, String palavraingles) {
        this.numeroCartao = numeroCartao;
        this.palavraIngles = palavraingles;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public String getPalavraingles() {
        return palavraIngles;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setPalavraingles(String palavraingles) {
        this.palavraIngles = palavraingles;
    }
}
