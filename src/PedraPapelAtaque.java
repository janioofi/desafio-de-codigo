
import java.util.*;
public class PedraPapelAtaque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String jogador1, jogador2;
        for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();
            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
            else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 1 venceu");
            else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("pedra")) System.out.println("Jogador 2 venceu");

            else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
            else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");

            else if (jogador2.equalsIgnoreCase("papel") && jogador1.equalsIgnoreCase("pedra")) System.out.println("Jogador 1 venceu");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 2 venceu");
            else System.out.println("Sem ganhador");
        }
    }
}