package Day13;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;++i)
        {
            int min = i;
            for(int j=i+1;j<arr.length;++j)
            {
                if(arr[min] > arr[j])
                    min = j;
            }
            swap(arr, i, min);
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

        double start = System.currentTimeMillis();
        selectionSort(arr);
        double end = System.currentTimeMillis();
        double total = (end - start) ;
        System.out.println("Total Time: "+total);
        System.out.println("After using Selection sort\n"+Arrays.toString(arr));
    }
}
