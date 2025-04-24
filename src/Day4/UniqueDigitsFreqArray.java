package Day4;

import java.util.Scanner;

public class UniqueDigitsFreqArray
{
    public static boolean hasUniqueDigits(int n)
    {
        int[] freq = new int[10];
        int c = 0;
        while(n>0)
        {
            freq[n%10]++;
            if(freq[n%10]>1)
                return false;
            c++;
            if(c>10)
                return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(hasUniqueDigits(n))
            System.out.println(n+" has Unique digtis");
        else
            System.out.println(n+" has no Unique digits");
    }
}
