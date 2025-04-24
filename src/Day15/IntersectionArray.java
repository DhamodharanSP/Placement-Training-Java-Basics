package Day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 => Enter total number of Elements: ");
        int n = in.nextInt();
        System.out.printf("Enter %d Elements, \n",n);
        int[] arr = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = in.nextInt();

        System.out.print("2 => Enter total number of Elements: ");
        int m = in.nextInt();
        System.out.printf("Enter %d Elements, \n", m);
        int[] brr = new int[m];
        for(int i = 0; i< m; ++i)
            brr[i] = in.nextInt();

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr)
            set.add(i);
        for(int j:brr)
        {
            if(!set.add(j))
                list.add(j);
        }
        System.out.println(list);
    }
}
