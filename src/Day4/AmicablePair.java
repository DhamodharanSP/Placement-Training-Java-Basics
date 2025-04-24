package Day4;

import java.util.Scanner;

public class AmicablePair
{
    public static int factors(int n)
    {
        int sum = 0;
        for(int i=2;i<=(int)Math.sqrt(n);++i)
        {
            if(n%i==0)
            {
                if(n/i==(int)Math.sqrt(n))
                    sum += i;
                else
                    sum += i + n/i;
            }
        }
        return sum;
    }
    public static boolean isAmicablePairs(int a, int b)
    {
        int factorSumA = factors(a);
        int factorSumB = factors(b);
        return factorSumA==b-1 && factorSumB==a-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(isAmicablePairs(num1,num2))
            System.out.println(num1+" and "+num2+" are Amicable Pairs");
        else
            System.out.println(num1+" and "+num2+" are not Amicable Pairs");
    }
}
