import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int tempo, velocidade;
        double litros;
        Scanner teclado = new Scanner(System.in);
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        litros = (double) (tempo * velocidade) / 12;
        System.out.printf("%.3f%n", litros);
        teclado.close();

    }

}