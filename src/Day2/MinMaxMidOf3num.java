package Day2;

import java.util.Scanner;

public class MinMaxMidOf3num
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = Math.min(a,Math.min(b,c));
        int max = Math.max(a,Math.max(b,c));
        int mid = (a+b+c) - (min+max);
        System.out.printf("Minimum: %d\nMiddle: %d\nMaximum: %d",min,mid,max);
    }
}
