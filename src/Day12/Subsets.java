package Day12;

import java.util.*;

public class Subsets
{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // Start with empty subset

        for (int num : nums) {
            int size = subsets.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(subsets.get(i));
                newSubset.add(num);
                System.out.println("New Subset "+i+" -> "+newSubset);
                subsets.add(newSubset);
                System.out.println("Total Subset "+i+" -> "+subsets);
            }
        }

        // Print all subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

//        int[] nums = {1, 2, 3, 4};
//        int n = nums.length;
//        int total = 1 << n; // 2^n
//
//        for (int i = 0; i < total; i++) {
//            System.out.print("[");
//            for (int j = 0; j < n; j++) {
//                if ((i & (1 << j)) != 0) {
//                    System.out.print(nums[j] + " ");
//                }
//            }
//            System.out.println("]");
//        }
    }
}
