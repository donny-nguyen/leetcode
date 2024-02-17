package org.example.problem;

public class Problem2369 {
    public Problem2369() {
        System.out.println(validPartition(new int[]{4, 4, 4, 5, 6}) == true);
        System.out.println(validPartition(new int[]{1, 1, 1, 2}) == false);
        System.out.println(validPartition(new int[]{993335, 993336, 993337, 993338, 993339, 993340, 993341}) == false);
    }

    public boolean validPartition(int[] nums) {
        boolean[] validations = new boolean[nums.length + 1];
        validations[0] = true;
        validations[2] = nums[0] == nums[1];
        for (int i = 3; i <= nums.length; i++) {
            validations[i] = (validations[i - 2] && nums[i - 2] == nums[i - 1]) ||
                    (validations[i - 3] && ((nums[i - 3] == nums[i - 2] && nums[i - 2] == nums[i - 1]) ||
                            (nums[i - 3] + 1 == nums[i - 2] && nums[i - 2] + 1 == nums[i - 1])));
        }
        return validations[nums.length];
    }
}
