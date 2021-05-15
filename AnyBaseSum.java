import java.util.*;

public class AnyBaseSum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b  = scn.nextInt();

        int k = getSum(n1,n2,b);
        System.out.println(k);
    }
    public static int getSum(int n1,int n2,int b)
    {
        int carry = 0;
        int count = 0;
        int pow = 1;
        while( n1>0 || n2>0 || carry>0)
        {
            int k = n1%10 + n2%10 + carry;
            n1 = n1/10;
            n2 = n2/10;
            carry = k/b;
            int d = k%b;

            count += pow*d;
            pow *= 10;
        }
        return count;
    }
}