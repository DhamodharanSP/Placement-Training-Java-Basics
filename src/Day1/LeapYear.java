package Day1;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if(y%4==0 && (y%100!=0 || y%400==0))
            System.out.println(y+" is a Leap Year");
        else
            System.out.println(y+" is not a Leap Year");
    }
}
