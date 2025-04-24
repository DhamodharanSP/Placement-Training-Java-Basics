package Day11;

import java.util.Scanner;

public class ReverseNumber
{
    public static int reverse(int n, int rev)
    {
        if(n==0)
            return rev;
        return reverse( n/10, rev * 10 + n%10);
    }

    // Below method is not suitable if it contain inbetween 0's

//    public static int reverse(int n)
//    {
//        if(n<10)
//            return n;
//        else
//        {// 1234
//            int c = (int)Math.log10(n)+1;
//            int pw = (int)Math.pow(10,c);// 10000
//            int pw2 = pw/10;// 1000
//            return reverse(n % pw2) * 10 + (n%pw)/pw2;//  4321  123456  034
//        }
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int rev = reverse(n, 0);
//        int rev = reverse(n);
        System.out.println(rev);
    }
}
