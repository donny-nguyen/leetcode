package org.example.problem;

public class Problem0405 {
    public Problem0405() {
        System.out.println(toHex(26).equals("1a"));
        System.out.println(toHex(-1).equals("ffffffff"));
        System.out.println(toHex(0).equals("0"));
    }

    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder stringBuilder = new StringBuilder();
        int bitCount = 32;
        while (num != 0 && bitCount != 0) {
            int digit = num & 0xf;
            char hexChar = digitToHexChar(digit);
            stringBuilder.append(hexChar);
            num >>= 4;
            bitCount -= 4;
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

// num          -1      1111 1111
// 0-num        1       0000 0001
// ^digits              1111 1110
// ^digits+1            1111 1111
