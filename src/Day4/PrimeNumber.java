package Day4;

import java.util.Scanner;

public class PrimeNumber
{
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);++i)
        {
            if(n%i==0) return false;
        }
        return !(n<=1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;++i)
        {
            if(isPrime(i))
                System.out.println(i);
        }
//        if(isPrime(n))
//            System.out.println(n+" is a Prime Number");
//        else
//            System.out.println(n+" is not a Prime Number");
    }
}
