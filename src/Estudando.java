import java.util.Scanner;

public class Estudando {

    private String nome;
    private int idade;
    private double valor_Venda;
    private double soma_total_Vendas;
    private double reginstrar_Vendas;
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setReginstrar_Vendas() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o "+(i+1)+"° produto: ");
            valor_Venda = scan.nextDouble();
            soma_total_Vendas += valor_Venda;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSoma_total_Vendas() {
        return soma_total_Vendas;
    }
}
