import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, prod;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        prod = a * b;
        System.out.println("PROD = " + prod);
        teclado.close();

    }

}