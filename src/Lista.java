public class Lista {
    private No primeiro;
    private No ultimo;
    private int contador;

    public No getPrimeiro() {
        return primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public int getContador() {
        return contador;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public boolean isEmpty(){
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean pop() {
        if(isEmpty()) {
            return false;
        }
        No atual = primeiro;
        No anterior = null;

        while (atual.getProximo() != null) {
            anterior = atual;
            atual = atual.getProximo();

        }
        anterior.setProximo(null);
        atual = anterior;
        contador--;
        return true;
    }

    public void insert (Pessoa p) {
        No novoNo = new No(p);
        if (isEmpty()) {
            primeiro = novoNo;
        } else {
            ultimo.setProximo(novoNo);
        }
        ultimo = novoNo;
        contador++;
    }

    public void imprimirLista() {
        No atual = primeiro;
        while (atual != null) {
            Pessoa pessoa = atual.getP();
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
            atual = atual.getProximo();
        }
    }
}
