package Day16.TwoDArray;

import java.util.Scanner;

public class BoundaryRun
{
    public static void traverseRight(int[][] arr, int fix, int st, int end)
    {
        for(int i=st;i<end;++i)
            System.out.print(arr[fix][i]+" ");
        System.out.println();
    }
    public static void traverseBottom(int[][] arr, int fix, int st, int end)
    {
        for(int i=st;i<end;++i)
            System.out.print(arr[i][fix]+" ");
        System.out.println();
    }
    public static void traverseLeft(int[][] arr, int fix, int st, int end)
    {
        for(int i=st;i>end;--i)
            System.out.print(arr[fix][i]+" ");
        System.out.println();
    }
    public static void traverseUp(int[][] arr, int fix, int st, int end)
    {
        for(int i=st;i>end;--i)
            System.out.print(arr[i][fix]+" ");
        System.out.println();
    }
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

        int top = 0, bottom = a, left = 0, right = b;
        while(top <= bottom && left <= right)
        {
            traverseRight(mat1, top, left, right);
            top++;
            traverseBottom(mat1, right-1, top, bottom);
            right--;
            traverseLeft(mat1, bottom-1, right, left);
            bottom--;
            traverseUp(mat1, left, bottom, top);
            left++;
        }

    }
}


