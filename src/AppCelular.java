public class AppCelular {

    public static void main(String[] args) {
        Celular meuCelular = new Celular("Samsung", "Galaxy S21", "123456789", 20.0);
        meuCelular.fazerLigacao(5);
        meuCelular.enviarMensagem("987654321", "Olá!");
        meuCelular.desligarCelular();
    }
}
