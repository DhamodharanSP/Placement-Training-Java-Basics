package Day17;

import java.util.Scanner;

public class ForwardBottomZigZag
{
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

        for(int i=0;i<n;++i)
        {
            int k = i;
            int j = 0; // fixed start
            while(k>=0)
            {
                System.out.print(arr[k--][j++]+" ");
            }
            System.out.println();
        }

        for(int j=1;j<n;++j)
        {
            int k = j;
            int i = n-1; // fixed start
            while(k<n)
            {
                System.out.print(arr[i--][k++]+" ");
            }
            System.out.println();
        }

    }
}
