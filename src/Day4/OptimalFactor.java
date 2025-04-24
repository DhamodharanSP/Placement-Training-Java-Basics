package Day4;

import java.util.Scanner;

public class OptimalFactor
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();
        for(int i = 1;i<=(int)Math.sqrt(n);++i)
        {
            if(n%i==0)
            {
                if(n/i==(int)Math.sqrt(n))
                    System.out.println(i);
                else
                    System.out.println(i+" "+n/i);
            }
        }
    }
}
