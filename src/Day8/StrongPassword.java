package Day8;

import java.util.Scanner;

public class StrongPassword
{
    public static boolean isStrong(String s)
    {
        boolean upperCase = false, lowerCase = false, digit = false, special = false;
        if(s.length() < 8)
            return true;
        String spl = "!@#$%^&*()_+-={}[]:;\"'<>?,./~`";
        for(int i=0;i<s.length();++i)
        {
            char ch = s.charAt(i);
            if(upperCase && lowerCase && digit && special)
                return true;
            if(Character.isUpperCase(ch)) upperCase = true;
            else if(Character.isLowerCase(ch)) lowerCase = true;
            else if(spl.contains(Character.toString(ch))) special = true;
            else if(Character.isDigit(ch)) digit = true;
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String s = in.nextLine();
        if(isStrong(s))
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}
