public class Retangulo extends Shape{
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
        return altura * largura;
    }
}