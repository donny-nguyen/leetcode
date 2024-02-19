package org.example.problem;

public class Problem0151 {
    public Problem0151() {
        System.out.println(reverseWords("the sky is blue").equals("blue is sky the"));
        System.out.println(reverseWords("  hello world  ").equals("world hello"));
        System.out.println(reverseWords("a good   example").equals("example good a"));
    }

    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
        }
        return stringBuilder.toString();
    }
}
