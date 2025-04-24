package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation
{
    public static void rotate(int[] arr, int k)
    {
        int len = arr.length;
        k = k%len;
        if(k<0) k = len + k;
        while(k>0)
        {
            int temp = arr[len-1];
            for (int i = len - 1; i > 0; --i)
            {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            k--;
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
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
