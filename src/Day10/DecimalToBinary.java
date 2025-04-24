package Day10;

import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dig = in.nextInt();
        int bit = 0;

        int pv = 1;
        while(dig>0)
        {
            bit = bit * pv + dig%2;
            pv*=10;
            dig/=2;
        }
        System.out.println(bit);
    }
}
