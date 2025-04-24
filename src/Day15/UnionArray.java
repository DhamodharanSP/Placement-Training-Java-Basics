package Day15;

import java.util.*;

public class UnionArray
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

        // This will remove all the duplicates and joins the two arrays...
        for(int i:arr)
            set.add(i); // if there are any repetitions in it, it only considers once... So, this will fail the property of union (mathematically)
        for(int j:brr)
            set.add(j);
        System.out.println(set);


    }
}
