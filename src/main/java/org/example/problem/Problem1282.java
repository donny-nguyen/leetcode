package org.example.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1282 {
    public Problem1282() {
        List<List<Integer>> result;
        result = groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3});
        result = groupThePeople(new int[]{2, 1, 3, 3, 3, 2});
        System.out.println("Problem1282 - Done");
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];

            List<Integer> list;
            if (map.containsKey(size))
                list = map.get(size);
            else
                list = new ArrayList<>();
            list.add(i);
            map.put(size, list);

            if (list.size() == size) {
                result.add(list);
                map.remove(size);
            }
        }

        return result;
    }
}
