package Day12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PermutationString
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
            permute(arr,  fix+1);
            swap(arr, i, fix);
        }

    }

    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        permute(arr, 0);
//        System.out.println(Arrays.toString(arr));
    }
}
