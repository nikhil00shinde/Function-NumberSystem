import java.util.*;

public class DigitFrequency
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int freq = checkFreq(n,k);
        System.out.println(freq);
    }

    public static int checkFreq(int n,int k)
    {
        int count = 0;

        while(n>0)
        {
            int d =n%10;
            n = n / 10;

            if(d == k)
            {
                count++;
            }
        }
        return count;
    }
}