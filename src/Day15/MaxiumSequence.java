package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class MaxiumSequence
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of Elements: ");
        int n = in.nextInt();
        System.out.printf("Enter %d Elements, \n",n);
        int[] arr = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = in.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for(int i:arr)
            set.add(i);

        int c = 0;
        int max = 0;
        for(int i=0;i<n;++i)
        {
            if(!set.contains(arr[i]-1))
            {
                int seq = arr[i];
                c=1;
                while(set.contains(seq + 1))
                {
                    seq++;
                    c++;
                }
            }
            max = Math.max(max, c);
        }

        System.out.println(max);
    }
}
