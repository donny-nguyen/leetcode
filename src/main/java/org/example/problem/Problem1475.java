package org.example.problem;

public class Problem1475 {
    public Problem1475() {
        int[] answer = finalPrices(new int[]{8, 4, 6, 2, 3});
        // Expected: 4,2,4,2,3
        for (int price : answer)
            System.out.print(price + " ");

        System.out.println();

        answer = finalPrices(new int[]{1, 2, 3, 4, 5});
        // Expected: 1,2,3,4,5
        for (int price : answer)
            System.out.print(price + " ");

        System.out.println();

        answer = finalPrices(new int[]{10, 1, 1, 6});
        // Expected: 9,0,1,6
        for (int price : answer)
            System.out.print(price + " ");
    }

    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            answer[i] = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    answer[i] -= prices[j];
                    break;
                }
            }
        }

        return answer;
    }
}
