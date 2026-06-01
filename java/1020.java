import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int contagem,
                anos = 0,
                meses = 0,
                dias = 0;

        Scanner teclado = new Scanner(System.in);
        contagem = teclado.nextInt();

        anos = contagem / 365;
        contagem %= 365;

        meses = contagem / 30;
        contagem %= 30;

        dias = contagem;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        teclado.close();

    }

}