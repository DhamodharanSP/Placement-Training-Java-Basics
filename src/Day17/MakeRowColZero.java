package Day17;

import java.util.Scanner;

public class MakeRowColZero
{
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

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                if(arr[i][j]==0)
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                if(row[i])
                    arr[i][j] = 0;
                if(col[j])
                    arr[i][j] = 0;
            }
        }

        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
