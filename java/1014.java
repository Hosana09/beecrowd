import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double distancia, combustivel, consumo;
        Scanner teclado = new Scanner(System.in);
        distancia = teclado.nextDouble();
        combustivel = teclado.nextDouble();
        consumo = distancia / combustivel;
        System.out.printf("%.3f km/l%n", consumo);
        teclado.close();

    }

}