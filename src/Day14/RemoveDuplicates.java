package Day14;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        int[] arr = {1,1,6,4,6,7,19,23,10,2,7};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i:arr)
        {
            list.add(i);
            if (res.get(list.get(i))==null)
                res.add(i);
        }
        System.out.println(res);
    }
}
