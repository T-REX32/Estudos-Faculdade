public class ListaSimples {

    private No primeiro;
    private No ultimo;
    private int qtdeNos;
    public ListaSimples (){

    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
    public int getQtdeNos(){
        return qtdeNos;
    }
    public void setQtdeNos(int qtdeNos) {
        this.qtdeNos = qtdeNos;
    }

    // ver se está vazio
    public boolean isEmpty() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pop(String valor) {
        if (isEmpty()) {
            return false;
        }
        No atual = primeiro;
        No anterior = null;

        while (atual.getProximo() != null) {
            anterior = atual;
            atual = atual.getProximo();
        }

        anterior.setProximo(null);
        ultimo = anterior;

        qtdeNos--;
        return true;
    }

    //adiciona elementos na lista
    public void adicionar (Pessoa p) {
        No novoNo = new No(p);
        if (isEmpty()) {
            primeiro = novoNo;
        } else {
            ultimo.setProximo(novoNo);
        }
        ultimo = novoNo;
        qtdeNos++;
    }
    // Método para imprimir a lista de nomes e idades
    public void imprimirLista() {
        No atual = primeiro;
        while (atual != null) {
            Pessoa pessoa = atual.getP();
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
            atual = atual.getProximo();
        }
    }
}
