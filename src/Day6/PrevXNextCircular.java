package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class PrevXNextCircular
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
            res[i] = arr[(i-1)<0?n-1:i-1] * arr[(i+1)%n];

        System.out.println(Arrays.toString(res));
    }
}
