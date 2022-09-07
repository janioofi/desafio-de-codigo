import java.util.*;

public class ReduzirNumero
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 0)
        {
            if(num % 2 == 0){
                num = num/ 2;
            }else{
                num--;
            }
            step++;
        }
        System.out.println(step);
    }
}