package Day13;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class MinimumUseOfPseudoBinaryToSumN
{
    public static void findSum(int n) {
        while(n>0)
        {
            int temp = n;
            int pv = 1, res = 0;
            while (temp > 0)
            {
                int rem = temp % 10;
                if (rem > 0)
                    res = 1 * pv + res;
                else
                    res = 0 * pv + res;
                temp /= 10;
                pv *= 10;
            }
            System.out.print(res+" + ");
            n -= res;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Optimal Pseudo Binary Numbers of "+n+" is ");
        findSum(n);
    }
}
