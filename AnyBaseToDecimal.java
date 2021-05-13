import java.util.*;

public class AnyBaseToDecimal
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b = scn.nextInt();
        printAnyBaseToDecimal(n,b);
    }
    public static void printAnyBaseToDecimal(int n,int b)
    {
        int ans = 0;
        int pow1 = 0;

        while(n>0)
        {
            int d = n%10;
            n = n/10;
            ans = ans + d*(int)(Math.pow(b,pow1));
            pow1++;
        }
        System.out.println(ans);
    }
}