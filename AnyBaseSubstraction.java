import java.util.*;

public class AnyBaseSubstraction
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int b = scn.nextInt();

        int k = getSubs(n1,n2,b);
        System.out.println(k);
    }
    public static int getSubs(int n1,int n2,int b)
    {
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while(n2 > 0 || carry > 0)
        {
            int d1 = n1%10;
            int d2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;

            int k = d2 +carry - d1;
             
            if(k < 0)
            {
                k += b;
                carry = -1;
            }
            else
            {
                carry = 0;
            }
            ans += k*pow;
            pow *= 10;
        }
        return ans;
    }
}