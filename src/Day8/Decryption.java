package Day8;

import java.util.Scanner;

public class Decryption
{
    public static String decrypt(String s)
    {
        char[] str = s.toCharArray();
        int px = 0;
        for(int i=s.length()-1;i>=0;--i)
        {
            if(str[i]!=' ')
                str[i] = (char)(str[i]+px++);
            else
                px = 0;
        }
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Encrypted Message: "+s);
        System.out.println("Decrypted Message: "+decrypt(s));
    }
}

// dfaj eks

// hhbj gls
