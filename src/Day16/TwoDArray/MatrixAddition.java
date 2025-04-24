package Day16.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows & cols for a Square Matrix 1: ");
        int a = in.nextInt();
        int[][] mat1 = new int[a][a];
        for(int i=0;i<a;++i)
        {
            for(int j=0;j<a;++j)
                mat1[i][j] = in.nextInt();
        }

        System.out.println("Enter no. of rows & cols for a Square Matrix 2: ");
        int n = in.nextInt();
        int[][] mat2 = new int[n][n];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
                mat2[i][j] = in.nextInt();
        }

        System.out.println("Matrix Addition:");
        if(a!=n)
        {
            System.out.println("Not Possible for different size");
            return;
        }
        int[][] res = new int[n][n];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
                res[i][j] = mat1[i][j] + mat2[i][j];
        }
        System.out.println(Arrays.deepToString(res));
    }
}


// 1 2 3    1 2
// 4 5 6    3 4
// 7 8 9    5 6


//
//