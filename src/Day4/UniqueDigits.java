package Day4;

import java.util.Scanner;

public class UniqueDigits
{
    public static boolean isUnique(int n)
    {
        for(int i=0;i<=9;++i)
        {
            int c = 0;
            int temp = n;
            while(temp>0)
            {
                int rem = temp%10;
                if(rem == i)
                    c++;
                temp /= 10;
            }
            return c>1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isUnique(n)) System.out.println("All digits are Unique");
        else System.out.println("All digits are not Unique");
    }
}
