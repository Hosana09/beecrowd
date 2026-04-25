import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, c, maior;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        maior = Math.max(a, Math.max(b, c));
        System.out.println(maior + " eh o maior");
        teclado.close();

    }

}