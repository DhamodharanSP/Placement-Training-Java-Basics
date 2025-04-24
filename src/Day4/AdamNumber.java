package Day4;

import java.util.Scanner;

public class AdamNumber
{
    public static int square(int n)
    {
        return n*n;
    }

    public static int reverse(int n)
    {
        int res = 0;
        while(n>0)
        {
            res = res*10 + n%10;
            n/=10;
        }
        return res;
    }

    public static boolean isAdamNumber(int n)
    {
        int sqrN = square(n);

        int revN = reverse(n);
        int sqrRevN = square(revN);
        int revSqrRevN = reverse(sqrRevN);

        return sqrN == revSqrRevN;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Upper Limit of Automorphic Numbers: ");
        int n = in.nextInt();
        for(int i=1;i<=n;++i)
        {
            if(isAdamNumber(i))
                System.out.println(i);
        }
//        if(isAdamNumber(n))
//            System.out.println(n+" is an Adam Number");
//        else
//            System.out.println(n+" is not an Adam Number");
    }
}
