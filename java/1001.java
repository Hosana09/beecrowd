import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, x;

        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        x = a + b;
        System.out.println("X = " + x);
        teclado.close();

    }

}