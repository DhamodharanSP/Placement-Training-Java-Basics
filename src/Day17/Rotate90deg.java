package Day17;

import java.util.Scanner;

public class Rotate90deg
{
    public static void rotateRow(int[] arr)
    {
        int l = 0, r = arr.length-1;
        while(l<r)
        {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
    public static void printMatrix(int[][] arr, int n, int m)
    {
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
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

        System.out.println("Array after 90deg rotation:");

        System.out.println("First Step: Transpose");
        for(int i=0;i<n;++i)
        {
            // Swapping with respect to elements above the primary diagonal
            for(int j=i+1;j<m;++j)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printMatrix(arr, n, m);

        System.out.println("Second Step: Reverse Each Row -> Rotated 90deg");

        for(int i=0;i<n;++i)
        {
            rotateRow(arr[i]);
        }
        printMatrix(arr, n, m);


    }
}
