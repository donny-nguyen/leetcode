package org.example.problem;

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
        return null;
    }
}
