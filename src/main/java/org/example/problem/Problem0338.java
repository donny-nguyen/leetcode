package org.example.problem;

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
            boolean[] bin = binary(i);
            ans[i] = countOne(bin);
        }
        return ans;
    }

    private boolean[] binary(int i) {
        return new boolean[0];
    }

    private int countOne(boolean[] bin) {
        return 0;
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
