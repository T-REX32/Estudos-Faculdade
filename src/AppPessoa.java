public class AppPessoa {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        Pessoa pes1 = new Pessoa();
        pes1.setNome("Caio");
        pes1.setIdade(18);
        lista.adicionar(pes1);

        Pessoa pes2 = new Pessoa();
        pes2.setNome("Isadora");
        pes2.setIdade(14);
        lista.adicionar(pes2);

        // Adicione mais pessoas conforme necessário...

        // Imprima a lista de nomes e idades
        lista.imprimirLista();
    }
}
