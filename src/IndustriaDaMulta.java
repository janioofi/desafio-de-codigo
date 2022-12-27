import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        if(velocidadeAtual < 60){
            System.out.println("Nao foi multado");
        }else{
            System.out.println("Foi multado");
        }

    }
}
