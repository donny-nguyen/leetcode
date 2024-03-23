package org.example.problem;

public class Problem0344 {
    public Problem0344() {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (char c : s)
            System.out.print(c);
        System.out.println();
        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        for (char c : s)
            System.out.print(c);
    }

    public void reverseString(char[] s) {
        char temp;
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            if (s[i] != s[j]) {
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }
}
