import java.util.*;
public class ContandoPares
{
    public static void main(String[] args)
    {
        int num = 30;
        var count = 0;

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}