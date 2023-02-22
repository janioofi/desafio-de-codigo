import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciFacil {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int[] fib = new int[n];

        for (int i = 0; i < n; i++) {
            if (i > 1) {
                fib[i] = fib[i-1] + fib[i-2];
            }
            else if(i == 0 || i == 1) fib[i] = i;
        }

        System.out.print(Arrays.toString(fib).replaceAll("(\\[|\\]|,)",""));

        leitor.close();
    }
}
