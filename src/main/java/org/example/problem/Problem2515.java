package org.example.problem;

public class Problem2515 {
    public Problem2515() {
        System.out.println(closetTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1) == 1);
        System.out.println(closetTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0) == 1);
        System.out.println(closetTarget(new String[]{"i", "eat", "leetcode"}, "ate", 0) == -1);
        System.out.println(closetTarget(new String[]{"ibkgecmeyx", "jsdkekkjsb", "gdjgdtjtrs", "jsdkekkjsb", "jsdkekkjsb", "jsdkekkjsb", "gdjgdtjtrs", "msjlfpawbx", "pbgjhutcwb", "gdjgdtjtrs"}, "pbgjhutcwb", 0) == 2);
        System.out.println(closetTarget(new String[]{"sjwjixunvm", "dpdykpuuen", "medqhltelb", "aoqabahtfx", "medqhltelb", "aoqabahtfx", "zgcmtppupi", "pgkzblegek", "zgcmtppupi", "rzwefukfpm"}, "vqjqatovzh", 4) == -1);
    }

    public int closetTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target))
            return 0;
        int shortestDistance = 0;
        int loopCount = words.length / 2;
        for (int i = 0, j = (startIndex + 1) % words.length, k = (startIndex - 1 + words.length) % words.length; i < loopCount; i++, j++, k--) {
            shortestDistance++;
            if (j >= words.length) j = 0;
            if (k < 0) k = words.length - 1;
            if (words[j].equals(target) || words[k].equals(target))
                return shortestDistance;
        }
        return -1;
    }
}

//                        0        1    2     3           4
// words                {"hello", "i", "am", "leetcode", "hello"}
// startIndex                      ^
// words[startIndex]    "i"
// i                      ^
// words[i]             "i"     "hello"
// count                1

//                        0    1    2
// words                {"a", "b", "leetcode"}
// startIndex             ^
// words[startIndex]    "a"
// i                                    ^
// words[i]             "leetcode"
// count                1

//                        0    1      2                         length      loopCount
// words                {"i", "eat", "leetcode"}                3           3/2=1
// startIndex             ^
// words[startIndex]    "i"
// i                            ^
// words[i]             "leetcode"      "eat"
// j                                    ^
// words[j]             "eat"           "leetcode"
// count                1   2
