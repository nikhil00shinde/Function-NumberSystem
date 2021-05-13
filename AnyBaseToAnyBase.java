import java.util.*;

public class AnyBaseToAnyBase
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int k = printAnyBaseToAnyBase(n,b1,b2);
        System.out.println(k);
    }
    public static int printAnyBaseToAnyBase(int n,int b1,int b2)
    {
        int num =  getAnyBaseToDecimal(n,b1);
        return getDecimalToAnyBase(num,b2);
    }
    public static int getAnyBaseToDecimal(int n,int b)
    {
        int ans = 0;
        int pow = 1;

        while(n>0)
        {
            int d = n%10;

            n = n/10;
            ans = ans + pow*d;
            pow *= b;
        }
        return ans;
    }
    public static int getDecimalToAnyBase(int n,int b)
    {
        int ans = 0;
        int pow = 1;

        while(n>0)
        {
            int d = n%b;
            n = n/b;
            ans += d*pow;
            pow *= 10;
        }
        return ans;
    }
}