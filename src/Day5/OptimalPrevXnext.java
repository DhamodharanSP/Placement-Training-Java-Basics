package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class OptimalPrevXnext
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of Elements: ");
        int n = in.nextInt();
        System.out.printf("Enter %d Elements, \n",n);
        int[] arr = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));

        int prev;
        for(int i=0;i<n;++i)
        {
            prev = arr[i];
            if(i==0)
                arr[i] = arr[i]*arr[i+1];
            else if(i==n-1)
                arr[i] = arr[i-1]*prev;
            else
                arr[i] = prev*arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
