public class Celular {
    private String marca;
    private String modelo;
    private String numero;
    private double saldo;
    private boolean ligado;

    public Celular(String marca, String modelo, String numero, double saldo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.saldo = saldo;
        this.ligado = saldo > 0;
    }

    public void fazerLigacao(int duracao) {
        if (isLigado()) {
            double custo = duracao * 0.1;
            if (custo <= getSaldo()) {
                setSaldo(getSaldo() - custo);
                System.out.printf("Ligação realizada por %d minutos. Saldo restante: %.2f%n", duracao, getSaldo());
            } else {
                System.out.println("Saldo insuficiente para fazer a ligação.");
            }
        } else {
            System.out.println("O celular está desligado.");
        }
    }

    public void enviarMensagem(String destinatario, String mensagem) {
        if (isLigado()) {
            double custo = mensagem.length() * 0.05;
            if (custo <= getSaldo()) {
                setSaldo(getSaldo() - custo);
                System.out.printf("Mensagem enviada para %s. Saldo restante: %.2f%n", destinatario, getSaldo());
            } else {
                System.out.println("Saldo insuficiente para enviar a mensagem.");
            }
        } else {
            System.out.println("O celular está desligado.");
        }
    }

    public void ligarCelular() {
        setLigado(getSaldo() > 0);
        if (isLigado()) {
            System.out.println("Celular ligado.");
        } else {
            System.out.println("Saldo insuficiente para ligar o celular.");
        }
    }

    public void desligarCelular() {
        setLigado(false);
        System.out.println("Celular desligado.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean novoLigado) {
        ligado = novoLigado;
    }
}