package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{
    public static void reverse(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n/2;++i)
        {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of Elements: ");
        int n = in.nextInt();
        System.out.printf("Enter %d Elements, \n",n);
        int[] arr = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(arr));
    }
}
