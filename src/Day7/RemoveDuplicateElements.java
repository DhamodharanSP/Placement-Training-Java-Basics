package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements
{
    public static void removeDuplicate(int[] arr, int n)
    {
        int pt = 0;
        for(int i=0;i<n-1;++i)
        {
            if(arr[i] != arr[i+1])
                arr[pt++] = arr[i];
        }
        arr[pt++] = arr[n-1];

        while(pt < n)
        {
            arr[pt++] = 0;
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

        removeDuplicate(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
