import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int codigo1 = teclado.nextInt();
        int quantidade1 = teclado.nextInt();
        double valor1 = teclado.nextDouble();

        int codigo2 = teclado.nextInt();
        int quantidade2 = teclado.nextInt();
        double valor2 = teclado.nextDouble();

        double total = (quantidade1 * valor1) + (quantidade2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        teclado.close();

    }

}