import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int valor = entrada * mesada;
        System.out.println(valor);
    }
}
