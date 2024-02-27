package org.example.problem;

import java.util.ArrayList;
import java.util.List;

public class Problem0338 {
    public Problem0338() {
        int[] ans = countBits(2);
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println();

        ans = countBits(5);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = countOne(i);
        }
        return ans;
    }

    private int countOne(int num) {
        int countOne = 0;
        while (num > 0) {
            if ((num & 1) == 1)
                countOne++;
            num = num >> 1;
        }
        return countOne;
    }
}
