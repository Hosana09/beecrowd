import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int minutos, distancia;
        Scanner teclado = new Scanner(System.in);
        distancia = teclado.nextInt();
        minutos = distancia * 2;
        System.out.println(minutos + " minutos");
        teclado.close();

    }

}