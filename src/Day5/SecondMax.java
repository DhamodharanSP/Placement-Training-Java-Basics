package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax
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

        int max1 = arr[0], max2 = Integer.MIN_VALUE;
        for(int i=0;i<n;++i)
        {
            if(max1 < arr[i])
            {
                if(max2 != max1)
                    max2 = max1;
                max1 = arr[i];
            }
            else if(max2 < arr[i] && arr[i] < max1)
                    max2 = arr[i];
        }
        System.out.println("First Largest: "+max1);
        System.out.println("Second Largest: "+((max2 == Integer.MIN_VALUE)?"Invalid":max2));
    }
}
