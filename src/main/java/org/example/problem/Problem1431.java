package org.example.problem;

import java.util.ArrayList;
import java.util.List;

public class Problem1431 {
    public Problem1431() {
        List<Boolean> result = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(resultToString(result)); // [true,true,true,false,true]

        result = kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);
        System.out.println(resultToString(result)); // [true,false,false,false,false]

        result = kidsWithCandies(new int[]{12, 1, 12}, 10);
        System.out.println(resultToString(result)); // [true,false,true]
    }

    private String resultToString(List<Boolean> result) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < result.size(); i++) {
            stringBuilder.append(result.get(i) ? "T" : "F");
            if (i < result.size() - 1)
                stringBuilder.append(",");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return new ArrayList<>();
    }
}
