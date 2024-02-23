package org.example.problem;

import java.util.ArrayList;
import java.util.List;

public class Problem0338 {
    public Problem0338() {
        int[] ans = CountBits(2);
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println();

        ans = CountBits(5);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public int[] CountBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i < ans.length; i++) {
            List<Integer> bin = binary(i);
            ans[i] = countOne(bin);
        }
        return ans;
    }

    private List<Integer> binary(int i) {
        List<Integer> bin = new ArrayList<>();
        while(i > 0){
            int r = i / 2;
            int mod = i % 2;
            bin.add(mod);
            i = r;
        }
        return bin;
    }

    private int countOne(List<Integer> bin) {
        int countOne = 0;
        for(int e : bin) {
            if(e == 1)
                countOne++;
        }
        return countOne;
    }
}

// n = 2
// ans = {_, _, _}
// i = 0
//      b = binary(i) = 0
//      countOne(b) = 0
//      ans = [0, _, _}
// i = 1
//      b = binary(i) = 1
//      countOne(b) = 1
//      ans = [0, 1, _}
// i = 2
//      b = binary(i) = 10
//      countOne(b) = 1
//      ans = [0, 1, 1}

// binary(i)
// i = 5
// bin = {}
// r = i / 2 = 2
//      mod = i - r * 2 = 5 - 2 * 2 = 5 - 4 = 1
//      bin = {1}
//      i = r = 2
// r = i / 2 = 2 / 2 = 1
//      mod = i - r * 2 = 2 - 1 * 2 = 2 - 2 = 0
//      bin = {1, 0}
//      i = r = 1
// r = i / 2 = 1 / 2 = 0
//      mod = i - r * 2 = 1 - 0 * 2 = 1 - 0 = 1
//      bin = {1, 0, 1}
//      i = r = 0
