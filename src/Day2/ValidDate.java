package Day2;

import java.util.Scanner;

public class ValidDate
{
    public static boolean isLeapYear(int y)
    {
        if(y%4==0 && (y%100!=0 || y%400==0))
            return true;
        return false;
    }

    public static boolean isValidDate(int d,int m,int y)
    {
        if(y>=1900 && y<=9999)
        {
            if(m>=1 && m<=12)
            {
                if((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) && (d>=1 && d<=31))
                    return true;
                else if((m==4 || m==6 || m==9 || m==11) && (d>=1 && d<=30))
                    return true;
                else
                {
                    if(d>=1 && d<=28)
                        return true;
                    else if(d==29 && isLeapYear(y))
                        return true;
                    return false;
                }
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        if(isValidDate(d,m,y))
            System.out.println(d+"/"+m+"/"+y+" is a Valid date");
        else
            System.out.println(d+"/"+m+"/"+y+" is a not a Valid date");
    }
}
