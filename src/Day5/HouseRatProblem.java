package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRatProblem
{
    public static void isPossibleMethod1(int rats, int units, int[] capacity, int n)
    {
        int need = rats*units;
        int visited = 0;
        boolean flag = true;
        for(int i=0;i<n;++i)
        {
            visited += capacity[i];
            if(visited >= need) {
                System.out.printf("All rats are full at %dth house",i+1);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Food is not sufficient");
    }

    public static void isPossibleMethod2(int rats, int units, int[] capacity, int n)
    {
        int need = rats*units;
        int visited = 0;
        boolean flag = true;
        for(int i=0;i<n;++i)
        {
            visited += capacity[i];
            if(visited >= need) {
                System.out.printf("All rats are full at %dth house",i+1);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Food is not sufficient");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of Rats: ");
        int rats = in.nextInt();
        System.out.print("Enter number of units each rat has to eat: ");
        int units = in.nextInt();
        System.out.print("Enter number of Houses: ");
        int n = in.nextInt();
        int[] capacity = new int[n];
        for(int i=0;i<n;++i)
            capacity[i] = in.nextInt();
        System.out.printf("Capacity of %d Houses:",n);
        System.out.println(Arrays.toString(capacity));

        isPossibleMethod1(rats, units, capacity, n);
    }
}
