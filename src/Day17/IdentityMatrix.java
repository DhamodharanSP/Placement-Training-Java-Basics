package Day17;

import java.util.Scanner;

public class IdentityMatrix
{
    public static boolean isIdentityMatrix(int[][] arr, int n)
    {
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                if((i!=j && arr[i][j]!=0) || ((i==j && arr[i][j]!=1))) return false;
            }
        }
        return true;
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

        if(isIdentityMatrix(arr, n))
            System.out.println("It's an Identity Matrix");
        else
            System.out.println("It's not an Identity Matrix");
    }
}
