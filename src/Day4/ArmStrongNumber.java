package Day4;

import java.util.Scanner;

public class ArmStrongNumber
{
    public static boolean isArmStrong(int n)
    {
        int c = (int)Math.log10(n)+1;
        int sum = 0, temp = n;
        while(temp>0)
        {
            sum += Math.pow(temp%10,c);
            temp/=10;
        }
        return n==sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;++i)
        {
            if(isArmStrong(i))
                System.out.println(i);
        }
//        if(isArmStrong(n))
//            System.out.println(n+" is an ArmStrong Number");
//        else
//            System.out.println(n+" is an not ArmStrong Number");
    }
}
