package org.example.problem;

import java.util.HashSet;
import java.util.Set;

public class Problem1832 {
    public Problem1832() {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog") == true);
        System.out.println(checkIfPangram("leetcode") == false);
    }

    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            Character c = sentence.charAt(i);
            set.add(c);
        }
        return set.size() == 26;
    }
}
