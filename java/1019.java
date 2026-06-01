import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int N,
            horas = 0,
            minutos = 0,
            segundos = 0;

        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt();

        horas = N / 3600;
        N %= 3600;

        minutos = N / 60;
        N %= 60;

        segundos = N;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        teclado.close();

    }

}