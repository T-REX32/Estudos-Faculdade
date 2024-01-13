//CONSTRUTOR = METODO QUE PERMITE CRIAR/CONSTUIR OBJETOS DE UMA CLASSE
//METODOS DE UM OBJETO = FUNÇÕES/FUNCIONALIDADES
public class No {  //NOME DA CLASSE
    private Pessoa p;
    private No proximo;

    public No (Pessoa pessoa) {
        this.p = pessoa;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP (Pessoa p) {
        this.p = p;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo (No proximo) {
        this.proximo = proximo;
    }

}

