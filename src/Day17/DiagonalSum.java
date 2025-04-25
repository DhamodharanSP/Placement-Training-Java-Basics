package Day17;

import java.util.Scanner;

public class DiagonalSum
{
    public static int findDiaSum(int[][] arr, int n)
    {
        int sum = 0;
        for(int i=0;i<n;++i)
        {
            sum += arr[i][i] + arr[i][n-i-1];
        }
        if((n&1) == 1) sum -= arr[n/2][n/2];
        return sum;
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

        System.out.println("Diagonal Sum: " + findDiaSum(arr,n));
    }
}
