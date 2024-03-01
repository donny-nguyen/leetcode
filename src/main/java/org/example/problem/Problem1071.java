package org.example.problem;

public class Problem1071 {
    public Problem1071() {
        System.out.println(gcdOfStrings("ABCABC", "ABC").equals("ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB").equals("AB"));
        System.out.println(gcdOfStrings("LEET", "CODE").equals(""));
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX").equals("TAUXX"));
    }

    public String gcdOfStrings(String str1, String str2) {
        String shorterStr = str1.length() < str2.length() ? str1 : str2;
        String x = shorterStr;

        while (!x.isEmpty()) {
            if (canDevide(str1, x) && canDevide(str2, x))
                return x;
            do {
                x = x.substring(0, x.length() - 1);
            } while (!x.isEmpty() && shorterStr.length() % x.length() != 0);
        }
        return x;
    }

    private boolean canDevide(String str, String devider) {
        if (str.length() % devider.length() != 0)
            return false;

        for (int i = 0; i < str.length(); i += devider.length()) {
            String subStringOfStr = str.substring(i, i + devider.length());
            if (subStringOfStr.equals(devider) == false)
                return false;
        }

        return true;
    }
}

// str1 = "ABCABC", str2 = "ABC"
// x = str2 = "ABC"
//      str1.length() % x.length() == 0
//      x.equals(str1.substring(i,x.length())
// x = ""

// str1 = "ABABAB", str2 = "ABAB"
// x = str2 = "ABAB"
//      str1.length() % x.length() = 6 % 4 = 2 != 0
// x = x / 2 = "AB"
//      str1.length() % x.length() = 6 % 2 = 0 == 0
//      x.equals(str1.substring(i,x.length())
