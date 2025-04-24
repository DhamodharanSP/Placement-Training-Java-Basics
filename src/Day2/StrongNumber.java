package Day2;

import java.util.Scanner;

public class StrongNumber
{
    public static int fact(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;++i)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n, sum = 0;
        while(temp > 0)
        {
            sum = sum + fact(temp%10);
            temp/=10;
        }
        if(n == sum) System.out.println(n+" is a Strong Number");
        else System.out.println(n+" is not a Strong Number");
    }
}
