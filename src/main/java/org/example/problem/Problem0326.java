package org.example.problem;

public class Problem0326 {
    public Problem0326() {
        System.out.println(isPowerOfThree(27) == true);
        System.out.println(isPowerOfThree(0) == false);
        System.out.println(isPowerOfThree(-1) == false);
        System.out.println(isPowerOfThree(1) == true);
    }

    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n == -1) return false;

        n = Math.abs(n);
        while (n != 1 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
