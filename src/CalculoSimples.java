import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();

        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();

        //TODO: implemente sua solução aqui

        double total = (n2 * valor2) + (n1 * valor1);
            System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
