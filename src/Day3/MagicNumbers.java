package Day3;

import java.util.Scanner;

public class MagicNumbers
{
    public static boolean isMagicNumber(int n)
    {
        int digitSum = 0;
        int temp = n;
        while(temp>0)
        {
            digitSum += temp%10;
            temp/=10;
        }

        int revDigitSum = 0;
        temp = digitSum;
        while(temp > 0)
        {
            revDigitSum = revDigitSum*10 + temp%10;
            temp/=10;
        }

        int res = digitSum * revDigitSum;
        return n==res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isMagicNumber(n))
            System.out.println(n+" is a Magic number");
        else
            System.out.println(n+" is not a Magic number");

    }
}
