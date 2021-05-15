import java.util.*;

public class AnyBaseMultiplication
{
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2)
    {
        // write your code here
        int ans = 0;
        int pow = 1;
        while(n2>0)
        {
             int j = getProduct2(n1,n2%10,b); 
             ans = add(ans,j*pow,b);
             pow *= 10;
             n2 = n2/10;
        }
        return ans;
    }
    public static int getProduct2(int n1,int n,int b)
    {
        int carry = 0;
        int pow = 1;
        int ans = 0;
        while(n1 > 0 || carry > 0)
        {
            int d = n1%10;
            n1 = n1/10;

            int p = d*n + carry;
            carry  = p/b;
            int k = p%b;
            ans += k*pow;
            pow *= 10;
        }
        return ans;
    }
    public static int add(int n1,int n2,int b)
    {
          int carry = 0;
          int ans = 0;
          int pow = 1;

          while(n1 > 0 || n2 >0 || carry>0)
          {
              int d1 = n1%10;
              int d2 = n2%10;

              int k = d1 + d2 + carry;

              int p = k%b;
              carry = k/b;

              ans += p*pow;
              pow *= 10;
              n1 = n1/10;
              n2 = n2/10;

          }
          return ans;
    }
}