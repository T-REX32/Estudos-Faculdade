public class Animal {
    String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome+ " fez um som.");
    }

    public void andar() {
        System.out.println(nome+" está andando...");
    }
}
