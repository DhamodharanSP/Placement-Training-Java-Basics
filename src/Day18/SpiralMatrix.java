package Day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Enter no. of cols:");
        int m = in.nextInt();
        System.out.println("Enter the values:");
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
                matrix[i][j] = in.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        int top = 0, left = 0, right = m-1, bottom = n-1;

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;++i)
                list.add(matrix[top][i]);
            top++;

            for(int i=top;i<=bottom;++i)
                list.add(matrix[i][right]);
            right--;

            if(top>bottom) break;

            for(int i=right;i>=left;--i)
                list.add(matrix[bottom][i]);
            bottom--;

            if(left>right) break;

            for(int i=bottom;i>=top;--i)
                list.add(matrix[i][left]);
            left++;
        }

        System.out.println(list);
    }
}
