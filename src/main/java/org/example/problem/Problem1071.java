package org.example.problem;

public class Problem1071 {
    public Problem1071() {
        System.out.println(gcdOfStrings("ABCABC", "ABC").equals("ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB").equals("AB"));
        System.out.println(gcdOfStrings("LEET", "CODE").equals(""));
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX").equals("TAUXX"));
    }

    public String gcdOfStrings(String str1, String str2) {
        if (str1.isEmpty()) return str2;
        if (str2.isEmpty()) return str1;

        if (str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()), str2);
        if (str2.startsWith(str1))
            return gcdOfStrings(str2.substring(str1.length()), str1);

        return "";
    }
}
