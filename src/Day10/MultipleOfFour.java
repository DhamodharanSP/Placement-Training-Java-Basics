package Day10;

import java.util.Scanner;

public class MultipleOfFour
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n&3) == 0)
            System.out.println(n+" is a Multiple of 4");
        else
            System.out.println(n+" is not a Multiple of 4");
    }
}
