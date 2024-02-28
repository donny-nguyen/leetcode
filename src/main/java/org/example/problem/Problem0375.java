package org.example.problem;

public class Problem0375 {
    public Problem0375() {
        System.out.println(getMoneyAmount(10) == 16);
        System.out.println(getMoneyAmount(2) == 1);
    }

    public int getMoneyAmount(int n) {
        return getMoneyAmount(1, n);
    }

    private int getMoneyAmount(int min, int max) {
        int n = max - min + 1;

        int[] numbers = new int[n];
        for (int i = 0, j = min; i < n; i++, j++) {
            numbers[i] = j;
        }

        int[] leftSum = new int[n];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + numbers[i - 1];
        }

        int[] rightSum = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + numbers[i + 1];
        }

        int[] differences = new int[n];
        for (int i = 0; i < n; i++) {
            differences[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        int minIndex = minIndex(differences);
        int leftMin = minIndex > 0 ? getMoneyAmount(min, numbers[minIndex - 1]) : 0;
        int rightMin = minIndex < (n - 1) ? getMoneyAmount(numbers[minIndex + 1], max) : 0;

        return leftMin < rightMin ? numbers[minIndex] + rightMin : numbers[minIndex] + leftMin;
    }

    private int minIndex(int[] array) {
        int minIndex = 0;
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }
}
