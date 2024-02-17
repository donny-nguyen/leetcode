package org.example.problem;

public class Problem1768 {
    public Problem1768() {
        System.out.println(mergeAlternately("abc", "pqr").equals("apbqcr"));
        System.out.println(mergeAlternately("ab", "pqrs").equals("apbqrs"));
        System.out.println(mergeAlternately("abcd", "pq").equals("apbqcd"));
    }

    public String mergeAlternately(String word1, String word2) {
        int minLength = word1.length() < word2.length() ? word1.length() : word2.length();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }

        if(word1.length() > minLength)
            stringBuilder.append(word1.substring(minLength));
        else
            stringBuilder.append(word2.substring(minLength));

        return stringBuilder.toString();
    }
}
