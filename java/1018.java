import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int valorInicial,
                valor,
                cem = 0,
                cinquenta = 0,
                vinte = 0,
                dez = 0,
                cinco = 0,
                dois = 0,
                um = 0;

        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();
        valorInicial = valor;

        cem = valor / 100;
        valor %= 100;

        cinquenta = valor / 50;
        valor %= 50;

        vinte = valor / 20;
        valor %= 20;

        dez = valor / 10;
        valor %= 10;

        cinco = valor / 5;
        valor %= 5;

        dois = valor / 2;
        valor %= 2;

        um = valor;

        System.out.println(valorInicial);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
        teclado.close();

    }

}