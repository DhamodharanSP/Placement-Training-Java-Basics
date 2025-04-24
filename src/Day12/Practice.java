package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Practice
{
    public static void swap(char[] arr, int l, int r)
    {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void permute(char[] arr, int fix)
    {
        if(fix == arr.length-1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=fix;i<arr.length;++i)
        {
            swap(arr, i, fix);
            permute(arr, fix+1);
            swap(arr, i, fix);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        permute(s.toCharArray(),0);
    }
}
