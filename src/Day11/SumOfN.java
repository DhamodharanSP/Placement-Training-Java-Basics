package Day11;

import java.util.Scanner;

public class SumOfN
{
    public static int sumOfN(int n)
    {
        if(n<1)
            return 0;
        return n + sumOfN(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOfN(n));
    }
}
