package Day7;

import Day5.ReverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class OptimalArrayRotation
{

    public static void reverse(int[] arr, int st, int end)
    {
        int l = st, r = end;
        while(l<=r)
        {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
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

        System.out.print("Enter number of rotations: ");
        int k = in.nextInt();

        k = k%n;
        if(k<0) k = n + k;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        System.out.println(Arrays.toString(arr));
    }
}
