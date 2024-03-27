package org.example.problem;

public class Problem1832 {
    public Problem1832() {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog") == true);
        System.out.println(checkIfPangram("leetcode") == false);
    }

    public boolean checkIfPangram(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) < 0)
                return false;
        }
        return true;
    }
}
