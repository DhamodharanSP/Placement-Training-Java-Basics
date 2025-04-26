package Day17;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class ForwardTopZigZag
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

        for(int j=0;j<n;++j)
        {
            int k = j;
            int i = 0;
            while(k>=0)
            {
                System.out.print(arr[i++][k--]+" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;++i)
        {
            int k = i;
            int j = n-1;
            while(k<n)
            {
                System.out.print(arr[k++][j--]+" ");
            }
            System.out.println();
        }
    }
}
