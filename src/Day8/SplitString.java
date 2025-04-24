package Day8;

import java.util.Scanner;

public class SplitString
{
    public static String[] splitString(String s, char ch)
    {
        char[] str = s.toCharArray();
        int i;
        for(i=0;i<s.length();++i)
        {
            if(str[i]==ch)
                break;
        }
        return new String[] {};
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch = in.next().charAt(0);

        String f = s.substring(0,s.indexOf(ch)+1);
        String g = s.substring(s.indexOf(ch)+1,s.length());
        System.out.println(f);
        System.out.println(g);
    }
}
