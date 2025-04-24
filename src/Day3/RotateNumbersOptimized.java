package Day3;

import java.util.Scanner;

public class RotateNumbersOptimized
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int temp = n;
        int c = 0;
        while(temp>0)
        {
            temp/=10;
            c++;
        }

        k = k%c;
        if(k<0)
            k = c+k;

        int pow = (int)Math.pow(10,k);
        int first = n%pow;
        int last = n/pow;

        int res = first * (int)Math.pow(10,c-k) + last;
        System.out.println(res);
    }
}
