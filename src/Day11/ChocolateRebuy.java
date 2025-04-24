package Day11;

import java.util.Scanner;

public class ChocolateRebuy
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total amount you have: ");
        int n = in.nextInt();
        System.out.println("Enter amount for a single chocolate: ");
        int amt = in.nextInt();
        System.out.println("Enter number of wrappers to rebuy chocolates: ");
        int wrap = in.nextInt();

        int total = n*amt;

        int res = total + (total-1)/(wrap-1);
        System.out.println("Total chocolates bought by rebuying "+res);
    }
}
