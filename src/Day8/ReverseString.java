package Day8;

import java.util.Scanner;

public class ReverseString
{
    public static String reverse1(String s)
    {
        char[] str = s.toCharArray();
        int l = 0, r = s.length()-1;
        while(l<=r)
        {
            char temp = str[l];
            str[l++] = str[r];
            str[r--] = temp;
        }
        return new String(str);
    }
    public static String reverse2(String s)
    {
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;--i)
            str.append(s.charAt(i));
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Method 1 (Two Pointers): "+reverse1(s));
        System.out.println("Method 2 (Reverse Accessing): "+reverse2(s));
    }
}
