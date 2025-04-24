package Day8;

import java.util.Scanner;

public class ReverseCharactersExceptSpecial
{
    public static String reverseChar(String s)
    {
        char[] str = s.toCharArray();
        int l = 0, r = s.length()-1;
        while(l<=r)
        {
            while(!((str[l]>='A' && str[l]<='Z') || (str[l]>='a' && str[l]<='z')))
            {
                l++;
            }
            while(!((str[r]>='A' && str[r]<='Z') || (str[r]>='a' && str[r]<='z')))
            {
                r--;
            }
            char temp = str[l];
            str[l++] = str[r];
            str[r--] = temp;
        }
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(reverseChar(s));
    }
}
