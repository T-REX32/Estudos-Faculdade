import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    String descricao;
    double valor;
    int quantidade;

    public Produto(String nome, String descricao, double valor, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return valor * quantidade;
    }

}