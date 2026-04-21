import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String nome;
        double salario, montanteVendas, comissao, totalSalario;

        Scanner teclado = new Scanner(System.in);
        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        montanteVendas = teclado.nextDouble();
        comissao = montanteVendas * 0.15;
        totalSalario = salario + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", totalSalario);
        teclado.close();
    }

}