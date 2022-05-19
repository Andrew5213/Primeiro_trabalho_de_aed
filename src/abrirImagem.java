import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class abrirImagem {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\andre\\Downloads\\Trabalho1.pgm");
        File file1 = new File("C:\\Users\\andre\\Downloads\\Trabalho1_HomerSimpson.pgm");
        // System.out.println(file);
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }

        }
        //este pedaço e so para ler o arquivo
    }
}
