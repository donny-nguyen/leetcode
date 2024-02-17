package org.example.problem;

// https://leetcode.com/problems/goal-parser-interpretation/
public class Problem1678 {
    public Problem1678() {
        System.out.println(interpret("G()(al)").equals("Goal"));
        System.out.println(interpret("G()()()()(al)").equals("Gooooal"));
        System.out.println(interpret("(al)G(al)()()G").equals("alGalooG"));
    }

    public String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            char currentCharacter = command.charAt(i);
            if (currentCharacter == 'G') {
                stringBuilder.append(currentCharacter);
            } else {    // () or (al)
                char nextCharacter = command.charAt(i + 1);
                if (nextCharacter == ')') {
                    stringBuilder.append('o');
                    i++;
                } else {    // (al)
                    stringBuilder.append("al");
                    i += 3;
                }
            }
        }

        return stringBuilder.toString();
    }
}
