package org.example.problem;

public class Problem2515 {
    public Problem2515() {
        System.out.println(closetTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1) == 1);
        System.out.println(closetTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0) == 1);
        System.out.println(closetTarget(new String[]{"i", "eat", "leetcode"}, "ate", 0) == -1);
    }

    public int closetTarget(String[] words, String target, int startIndex) {
        return -2;
    }
}
