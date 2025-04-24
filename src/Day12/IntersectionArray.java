package Day12;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,23,54,87};
        int[] brr = {3,4,5,6,7,8,54};

        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i:arr)
            set.add(i);
        for(int i:brr)
        {
            if(!set.add(i))
                System.out.print(i+" ");
        }
    }
}
