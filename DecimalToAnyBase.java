import java.util.*;

public class DecimalToAnyBase
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b = scn.nextInt();
        printDecimalToAnyBase(n,b);
    }
    public static void printDecimalToAnyBase(int n,int b)
    {
        int base = 0;
        int pow = 1;

        while(n>0)
        {
            int d = n%b;
            n = n/b;
            base += pow*d;
            pow = pow*10;
        }
        System.out.println(base);
    }
}