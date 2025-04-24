package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class NumEqualsPreviousXNext
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

        int[] res = new int[n];
        for(int i=0;i<n;++i)
        {
            if(i==0)
                res[i] = arr[i]*arr[i+1];
            else if(i==n-1)
                res[i] = arr[n-1]*arr[n-2];
            else
                res[i] = arr[i-1]*arr[i+1];
        }
        System.out.println(Arrays.toString(res));

    }
}
