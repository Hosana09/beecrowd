import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double raio, pi, volume;
        Scanner teclado = new Scanner(System.in);
        pi = 3.14159;
        raio = teclado.nextDouble();
        volume = (4.0 / 3) * pi * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
        teclado.close();

    }

}