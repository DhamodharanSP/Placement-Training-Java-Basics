package Day11;

import java.util.Scanner;

public class RaisePower
{
    public static int power(int x, int y)
    {
        if(y==0)
            return 1;
        return x * power(x,y-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(power(a,b));
    }
}
