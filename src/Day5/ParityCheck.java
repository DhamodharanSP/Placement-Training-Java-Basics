package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class ParityCheck
{
    public static boolean isAlternatingParity(int[] arr)
    {
        for(int i=0;i<arr.length-1;++i)
        {
            if(arr[i]%2==0 && arr[i+1]%2!=1)
                return false;
            else if(arr[i]%2==1 && arr[i+1]%2!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of Elements: ");
        int n = in.nextInt();
        System.out.printf("Enter %d Elements, \n",n);
        int[] arr = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));

        if(isAlternatingParity(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
