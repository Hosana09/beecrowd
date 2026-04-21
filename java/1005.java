import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        double a, b, media;

        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
        teclado.close();

    }

}