package Day2;

import java.util.Scanner;

public class RemainingDaysinYear
{
    public static boolean isLeap(int y)
    {
        if(y%4==0 && (y%100!=0 || y%400==0)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(y)) months[1]++;
        int total = 0;
        int bal = months[m-1] - d;
        total += bal;
        for(int i=m;i<12;++i)
        {
            total += months[i];
        }
        System.out.println(total);
    }
}
