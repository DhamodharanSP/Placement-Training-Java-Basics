package Day16.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows for Matrix 1: ");
        int a = in.nextInt();
        System.out.println("Enter no. of cols for Matrix 1: ");
        int b = in.nextInt();
        int[][] mat1 = new int[a][b];
        for(int i=0;i<a;++i)
        {
            for(int j=0;j<b;++j)
                mat1[i][j] = in.nextInt();
        }

        System.out.println("Enter no. of rows for Matrix 2: ");
        int n = in.nextInt();
        System.out.println("Enter no. of cols for Matrix 2: ");
        int m = in.nextInt();
        int[][] mat2 = new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
                mat2[i][j] = in.nextInt();
        }

        System.out.println("Matrix Multiplication:");

        int[][] res = new int[a][m];

        for(int i=0;i<a;++i)
        {
            for(int j=0;j<m;++j)
            {
                for(int k=0;k<a;++k)
                    res[i][j] += mat1[i][k] * mat1[k][j];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
