package org.example.problem;

public class Problem1512 {
    public Problem1512() {
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}) == 4);
        System.out.println(numIdenticalPairs(new int[]{1, 1, 1, 1}) == 6);
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3}) == 0);
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
