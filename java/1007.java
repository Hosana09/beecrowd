import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, c, d, dif;

        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        dif = (a * b - c * d);
        System.out.println("DIFERENCA = " + dif);
        teclado.close();

    }

}