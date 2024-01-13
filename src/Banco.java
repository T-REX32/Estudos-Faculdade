public class Banco {
    private String nome;
    private int cnpj;
    private double saldo;

    public boolean setDepositar (double depositando) {
        if (depositando >= 0 && depositando <= 5000) {
            this.saldo += depositando;
            return true;
        } else {
            System.out.println("Não insira valores negativos!");
            return false;
        }
    }
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void setCnpj(int CNPJ) {
        this.cnpj = CNPJ;
    }

    public void setSaldo (double QtdSaldo){
        this.saldo = QtdSaldo;
    }
    public String getNome (){
        return this.nome;
    }

    public int getCnpj () {
        return this.cnpj;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
