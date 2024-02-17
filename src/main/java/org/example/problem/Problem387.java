package org.example.problem;

// https://leetcode.com/problems/first-unique-character-in-a-string/
public class Problem387 {
    public Problem387() {
        System.out.println(firstUniqChar("leetcode") == 0);
        System.out.println(firstUniqChar("loveleetcode") == 2);
        System.out.println(firstUniqChar("aabb") == -1);
    }

    public int firstUniqChar(String s) {
        int result = Integer.MAX_VALUE;

        for(char c = 'a'; c <= 'z'; c++) {
            int fistIndex = s.indexOf(c);
            if(fistIndex!=-1 && s.lastIndexOf(c) == fistIndex) {
                if(fistIndex < result) {
                    result = fistIndex;
                }
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
