public class EstudandoHeranca {

    public static void main(String[] args) throws InterruptedException {
        Retangulo saas = new Retangulo();
        saas.setAltura(20);
        saas.setLargura(10);
        processar(saas);

        Quadrado lool = new Quadrado();
        lool.setLado(20);
        lool.setLado(20);
        processar(lool);

    }
    public static void processar (Shape uau) {
        System.out.println("A área do "+uau.getClass()+" é: "+uau.area());
    }
}

