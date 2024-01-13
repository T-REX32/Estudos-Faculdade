import java.io. *;
public class Arquivos {
    public static void copiarArquivo(String origem, String destino) throws IOException {
        FileReader fr = new FileReader(origem);
        FileWriter fw = new FileWriter(destino);

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();
    }

    // Copiar conteúdo de um arquivo para outro com append
    public static void copiarArquivoAppend(String origem, String destino) throws IOException {
        FileReader fr = new FileReader(origem);
        FileWriter fw = new FileWriter(destino, true); // O segundo parâmetro 'true' indica append

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();
    }

    // Imprimir conteúdo de um arquivo na tela
    public static void imprimirConteudoArquivo(String arquivo) throws IOException {
        FileReader fr = new FileReader(arquivo);

        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }

        fr.close();
    }
}