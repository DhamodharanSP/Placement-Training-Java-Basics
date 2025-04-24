package Day9;

import java.util.Scanner;

public class LargestNumberInString
{
    public static int findMaxNum(String s)
    {
        int max = 0;
        for(int i=0;i<s.length();++i)
        {
            int sum = 0;
            while((s.charAt(i)>='0' && s.charAt(i)<='9') && (i<s.length()))
            {
                int digit = s.charAt(i)-'0';
                sum = sum*10 + digit;
                i++;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(findMaxNum(s));
    }
}
