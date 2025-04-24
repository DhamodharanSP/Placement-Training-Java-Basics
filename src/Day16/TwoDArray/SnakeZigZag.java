package Day16.TwoDArray;

import java.util.Scanner;

public class SnakeZigZag
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows for Matrix: ");
        int a = in.nextInt();
        System.out.println("Enter no. of cols for Matrix: ");
        int b = in.nextInt();
        int[][] mat1 = new int[a][b];
        for(int i=0;i<a;++i)
        {
            for(int j=0;j<b;++j)
                mat1[i][j] = in.nextInt();
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<a;++i)
        {
            for(int j=0;j<b;++j)
                System.out.print(mat1[i][j]+" ");
            System.out.println();
        }

        System.out.println("Zig Zig Matrix: ");
        for(int i=0;i<a;++i)
        {
            if(i%2==0)
            {
                for(int j=0;j<b;++j)
                    System.out.print(mat1[i][j]+" ");
                System.out.println();
            }
            else
            {
                for(int j=b-1;j>=0;--j)
                    System.out.print(mat1[i][j]+" ");
                System.out.println();
            }
        }
    }
}
