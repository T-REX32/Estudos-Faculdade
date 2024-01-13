public abstract class Shape {

    public abstract double area();

    public void getName(String nome) {
        nome = nome.getClass().getSimpleName();
    }
}
