package org.example.problem;

public class Problem0405 {
    public Problem0405() {
        System.out.println(toHex(26).equals("1a"));
        System.out.println(toHex(-1).equals("ffffffff"));
    }

    public String toHex(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            int digit = num & 0xf;
            char hexChar = digitToHexChar(digit);
            stringBuilder.append(hexChar);
            num >>= 4;
        }
        return stringBuilder.reverse().toString();
    }

    private char digitToHexChar(int digit) {
        if (digit < 10)
            return (char) ('0' + digit);
        return (char) ('a' + (digit - 10));
    }
}

// num          26      0001
// num & 0xf    1010    0001
// bin          [0001, 1010]

// digit        10              11              12
// return       'a'             'b'             'c'
// result       'a'+(10-10)     'a'+(11-10)     'a'+(12-10)
