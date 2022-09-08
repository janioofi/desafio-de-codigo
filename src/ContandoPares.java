import java.util.*;
public class ContandoPares
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;
        if(num == 30){
            num--;
        }

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}