package Day5;

import java.util.Scanner;

public class CountAbsDiffofElementsLessThanDiff
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements, ");
        for(int i=0;i<n;++i)
            arr[i] = in.nextInt();

        System.out.print("Enter the Number to Subtract: ");
        int num = in.nextInt();
        System.out.print("Enter the Maximum Absolute Difference: ");
        int diff = in.nextInt();

        int c = 0;
        for(int i=0;i<n;++i)  if(Math.abs(arr[i]-num)<=diff) c++;
        if(c!=0) System.out.println(c+" elements satisfy the given condition");
        else System.out.println("No elements satisfy the given condition");
    }
}
