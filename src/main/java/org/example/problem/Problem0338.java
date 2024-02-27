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
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++)
            f[i] = f[i >> 1] + (i & 1);
        return f;
    }
}
