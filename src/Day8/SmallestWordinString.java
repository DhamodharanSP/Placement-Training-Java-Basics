package Day8;

import java.util.Scanner;

public class SmallestWordinString
{
    public static String findSmall(String s)
    {
        int l = 0, r = 0;
        int min = s.length();
        int minL = 0, minR = 0;
        for(int i=0;i<s.length();++i)
        {
            char ch = s.charAt(i);
            l = i;
            while(ch!=' ' && i<s.length())
            {
                i++;
                if(i<s.length())
                    ch = s.charAt(i);
            }
            r = i-1;
            int len = r-l+1;
            min = Math.min(min,len);
            if(len == min)
            {
                minL = l;
                minR = r;
            }
        }
        return s.substring(l,r+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(findSmall(s));
    }
}


// Find the smallest word in string, if more than one, return the last
// Find the longest word in string, if more than one, return the last
// Find the smallest/longest ASCII sum word, if more than one, return the last
