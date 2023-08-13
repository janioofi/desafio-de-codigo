import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
        double numeroMinimoNodes = (double) numeroTotalPods / podsPorNode;
        double resultado1 = Math.ceil(numeroMinimoNodes);

        //TODO: Calcule o número mínimo de servidores necessários
        double numeroMinimoServidores = (double) numeroTotalPods / podsPorServidor;
        double resultado2 = Math.ceil(numeroMinimoServidores);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        if (resultado1 == 1) {
            System.out.println("1.Recomendamos usar um unico node");
        }
        else {
            System.out.println("1.Numero minimo de nodes:" + (int) resultado1);
        }

        System.out.println("2.Numero minimo de servidores:" + (int) resultado2);

        // Fechando o Scanner
        scanner.close();
    }
}
