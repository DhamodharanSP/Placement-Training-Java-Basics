package Day16;

import java.util.Scanner;

public class BetrothedNumber
{
    public static int factorSum(int n)
    {
        int sum = 0;
        for(int i=2;i<=(int)Math.sqrt(n);++i)
        {
            if(n%i==0)
            {
                sum += i;
                if(i!=n/i)
                    sum += n/i;
            }
        }
        return sum;
    }
    public static boolean isBetrothed(int a, int b)
    {
        int s1 = factorSum(a);
        int s2 = factorSum(b);
        return (a==s2 && b==s1);
    }
    public static void main(String[] args) {
        int a = 48, b = 75;
        if(isBetrothed(a,b))
            System.out.println(a+" and "+b+" are Betrothed Numbers");
        else
            System.out.println(a+" and "+b+" are not Betrothed Numbers");
    }
}
