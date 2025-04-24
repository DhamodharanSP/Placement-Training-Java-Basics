package Day12;

import java.util.Scanner;

public class NthMultipleOfK
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int k = 6;   =>  4 + 2 => 2^2 + 2^1 => 2 & 1 is used for shifting of 'n'
//        int n = in.nextInt();
//        System.out.println( (n<<1) + (n<<1) + (n<<1) + (n<<1) + (n<<1) + (n<<1) + (n<<1) + n);

        int k = in.nextInt();
        int n = in.nextInt();

        int res = 0;
        int temp = k/2;
        while(temp>0)
        {
            res += (n<<1);
            temp--;
        }
        if((k&1) == 1) res += n;
        System.out.println(res);


    }
}
