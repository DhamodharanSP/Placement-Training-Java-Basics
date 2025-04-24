package Day12;

import java.util.Scanner;

public class GCDrecursion
{
    public static int findGCD(int a, int b)
    {
        if(b==0)
            return a;
        return findGCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(findGCD(a,b));
    }
}
