import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int A, B, SOMA;

        Scanner teclado = new Scanner(System.in);
        A = teclado.nextInt();
        B = teclado.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
        teclado.close();

    }

}