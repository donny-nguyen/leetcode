package org.example.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem0118 {
    public Problem0118() {
        System.out.println(generate(5));
        System.out.println(generate(1));
    }

    private String resultToString(List<List<Integer>> result) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            stringBuilder.append("[");
            for (int j = 0; j < result.get(i).size(); j++) {
                stringBuilder.append(result.get(i).get(j));
                if (i < result.get(i).size() - 1)
                    stringBuilder.append(",");
            }
            stringBuilder.append("]");
            if (i < result.size() - 1)
                stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    line.add(1);
                } else {
                    Integer value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    line.add(value);
                }
            }
            triangle.add(line);
        }
        return triangle;
    }
}
