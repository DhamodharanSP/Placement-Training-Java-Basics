package Day15;

import java.util.*;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of Elements: ");
        int n = in.nextInt();
        System.out.printf("Enter %d Elements, \n",n);
        int[] arr = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr)
        {
            if(set.add(i))
                list.add(i);
        }

        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
