package Day17;

import java.util.Scanner;

public class ToeplitzMatrix
{
    public static boolean isToeplitz(int[][] arr, int n, int m)
    {
        for(int i=0;i<n-1;++i)
        {
            for(int j=0;j<m-1;++j)
            {
                if(arr[i][j] != arr[i+1][j+1])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Enter no. of cols:");
        int m = in.nextInt();
        System.out.println("Enter the values:");
        int[][] arr = new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
                arr[i][j] = in.nextInt();
        }

        if(isToeplitz(arr, n, m))
            System.out.println("\nIt is a Toeplitz Matrix");
        else
            System.out.println("\nIt is not a Toeplitz Matrix");
    }
}
