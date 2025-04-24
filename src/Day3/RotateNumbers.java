package Day3;

import java.util.Scanner;

public class RotateNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int temp = n;
        int c = 0, pv = 1;
        while(temp>0)
        {
            temp/=10;
            c++;
            pv *= 10;
        }
        pv /= 10;

        k = k%c;
        if(k<0) k = c+k;

        while(k>0)
        {
            int last = n%10;
            int front = n/10;
            n = last*pv + front;
            k--;
        }
        System.out.println(n);
    }
}
