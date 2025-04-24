package Day4;

import java.util.Scanner;

public class AutomorphicNumber
{
    public static boolean isAutoMorphic(long n)
    {
        long sqr = n*n;
        while(n>0 && sqr>0)
        {
            if(n%10 != sqr%10)
                return false;
            n/=10;
            sqr/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Upper Limit of Automorphic Numbers: ");
        long n = in.nextLong();
        for(long i=1;i<=n;++i)
        {
            if(isAutoMorphic(i))
                System.out.println(i);
        }
//        if(isAutoMorphic(n))
//            System.out.println(n+" is an AutoMorphic Number");
//        else
//            System.out.println(n+" is not an AutoMorphic Number");
    }
}
