package Day11;

import java.util.Scanner;

public class SumOfDigits
{
    public static int digitSum(int n)
    {
        if(n<10)
            return n;
        return n%10 + digitSum(n/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Sum of the digis in "+n+" is "+digitSum(n));
    }
}
