package org.example.problem;

public class Problem0375 {
    public Problem0375() {
        System.out.println(getMoneyAmount(10) == 16);
        System.out.println(getMoneyAmount(1) == 0);
        System.out.println(getMoneyAmount(2) == 1);
    }

    public int getMoneyAmount(int n) {
        int[][] minMoney = new int[n + 2][n + 1];
        for (int rangeLength = 2; rangeLength <= n; rangeLength++) {
            for (int start = 1; start <= (n - rangeLength + 1); start++) {
                int end = start + rangeLength - 1;
                int minMoneyAtThisRange = Integer.MAX_VALUE;
                for (int selectedNumber = start; selectedNumber <= end; selectedNumber++) {
                    int leftMoney = minMoney[start][selectedNumber - 1];
                    int rightMoney = minMoney[selectedNumber + 1][end];
                    int minMoneyWithSelectedNumber = selectedNumber + Math.max(leftMoney, rightMoney);
                    if (minMoneyWithSelectedNumber < minMoneyAtThisRange) {
                        minMoneyAtThisRange = minMoneyWithSelectedNumber;
                    }
                }
                minMoney[start][end] = minMoneyAtThisRange;
            }
        }
        return minMoney[1][n];
    }
}
