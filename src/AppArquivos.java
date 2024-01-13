import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppArquivos {
    public static void main(String[] args) throws IOException {
        String caminho = "D:\\estudos\\arq1.txt";
        String conteudo = "Olá, mundo!";

        FileWriter escritor = new FileWriter(caminho);
        escritor.write(conteudo);
        escritor.close();
        }
    }
