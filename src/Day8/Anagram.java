package Day8;

import java.util.Scanner;

public class Anagram
{
    public static boolean isAnagram(String s1, String s2)
    {
        int len1 = s1.length(), len2 = s2.length();
        if(len1!=len2)
            return false;

        int[] freq = new int[26];
        for(int i=0;i<len1;++i)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i:freq)
        {
            if(i!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next().toLowerCase();
        String s2 = in.next().toLowerCase();
        if(isAnagram(s1,s2))
            System.out.println(s1+" and "+s2+" are Anagram");
        else
            System.out.println(s1+" and "+s2+" are not Anagram");
    }
}
