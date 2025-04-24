package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{
    public static void bubbleSort(int[] arr, int n)
    {
        for(int i=0;i<arr.length-1;++i)
        {
            for(int j=i+1;j<arr.length-i;++j)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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

        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
