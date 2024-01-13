public class Aluno {
    private String nome;
    private double n1, n2, n3, media;

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }
    public double getN3() {
        return n3;
    }
    public double getMedia (){
        return media;
    }
    public String getNome(String s){
        return nome;
    }

    public void setN1(double jujuba) {
        if (jujuba >= 0 && jujuba <= 10) {
            this.n1 = jujuba;
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void setN2 (double pipoca) {
        if (pipoca >= 0 && pipoca <=10) {
            this.n2 = pipoca;
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void setN3 (double bagos) {
        if (bagos >= 0 && bagos <= 10) {
            this.n3 = bagos;
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void setMedia () {
        this.media = (n1+n2+n3) / 3;

    }
}
