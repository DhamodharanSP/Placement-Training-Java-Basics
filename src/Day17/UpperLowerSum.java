package Day17;

import java.util.Scanner;

public class UpperLowerSum
{
    public static int[] findUpLowSum(int[][] arr,  int n)
    {
        int upSum = 0, lowSum = 0;
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                if(i==j || j>i)
                    upSum += arr[i][j];
                if(i==j || j<i)
                    lowSum += arr[i][j];
            }
        }
        return new int[] {upSum,lowSum};
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows/cols:");
        int n = in.nextInt();
        System.out.println("Enter the values:");
        int[][] arr = new int[n][n];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
                arr[i][j] = in.nextInt();
        }
        int[] res = findUpLowSum(arr, n);
        System.out.println("Upper Triangle Sum (including Main diagonal): "+res[0]);
        System.out.println("Lower Triangle Sum (including Main diagonal): "+res[1]);

    }
}
