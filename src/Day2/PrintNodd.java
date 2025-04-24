package Day2;

import java.util.Scanner;

public class PrintNodd
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0,j=1;i<n;++i,j+=2)
            System.out.println(j);
    }
}
