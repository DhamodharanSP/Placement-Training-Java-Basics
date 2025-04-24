package Day10;

import java.util.Scanner;

public class IsPowerOfTwo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n&n-1) == 0)
            System.out.println(n+" is a Power of Two");
        else
            System.out.println(n+" is not a Power of Two");
    }
}
