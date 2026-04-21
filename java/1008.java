import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int num, horas;
        double valor, salario;

        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        horas = teclado.nextInt();
        valor = teclado.nextDouble();
        salario = horas * valor;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        teclado.close();

    }

}