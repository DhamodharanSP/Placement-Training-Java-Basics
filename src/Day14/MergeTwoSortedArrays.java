package Day14;

import java.util.ArrayList;

public class MergeTwoSortedArrays
{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2};
        int[] brr = {1,1,1,1,1,3};
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<arr.length || j<brr.length)
        {
            if(i<arr.length && j<brr.length)
            {
                if (arr[i] < brr[j])
                    list.add(arr[i++]);
                else
                    list.add(brr[j++]);
            }
            else if(i<arr.length)
                list.add(arr[i++]);
            else
                list.add(brr[j++]);
        }
        System.out.println(list);
    }
}
