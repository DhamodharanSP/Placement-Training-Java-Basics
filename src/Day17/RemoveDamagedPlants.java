package Day17;

import java.util.Scanner;

public class RemoveDamagedPlants
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Enter no. of cols:");
        int m = in.nextInt();
        System.out.println("Enter the Plant values:");
        int[][] plants = new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
                plants[i][j] = in.nextInt();
        }

        System.out.println("Enter the Coordinate of Damaged Plant:");
        System.out.print("X : ");
        int x = in.nextInt();
        System.out.print("Y : ");
        int y = in.nextInt();
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                if(i==x || j==y)
                    plants[i][j] = 0;
            }
        }
        System.out.println("After Removing the Plants on the Same Row and Column:");
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
                System.out.print(plants[i][j]+" ");
            System.out.println();
        }
    }
}
