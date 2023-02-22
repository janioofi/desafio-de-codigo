import java.util.Scanner;

public class SomaDeHComNTermos {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (double i = 1; i <= n; i++) {
            h += 1/i;
        }

        System.out.println(Math.round(h));

        sc.close();
    }
}
