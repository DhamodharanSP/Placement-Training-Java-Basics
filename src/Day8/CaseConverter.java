package Day8;

import java.util.Scanner;

public class CaseConverter
{
    public static String convertCase(String s)
    {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();++i)
        {
            char ch = s.charAt(i);
            if(ch==' ')
                res.append(ch);
            else if('a'-ch > 0)
                res.append((char)(ch+32));
            else
                res.append((char)(ch-32));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(convertCase(s));
    }
}
