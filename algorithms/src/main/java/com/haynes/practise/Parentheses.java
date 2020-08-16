package com.haynes.practise;

import com.haynes.algotithms.Stack;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Parentheses {
    private static final char LEFT_PAREN     = '(';
    private static final char RIGHT_PAREN    = ')';
    private static final char LEFT_BRACE     = '{';
    private static final char RIGHT_BRACE    = '}';
    private static final char LEFT_BRACKET   = '[';
    private static final char RIGHT_BRACKET  = ']';

    public static void main(String[] args) {
        String s = StdIn.readString();
        s = s.trim();
        Boolean flag = isBalanced(s);
        StdOut.println(flag);
    }

    private static Boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == LEFT_PAREN) stack.push(c);
            if (c == LEFT_BRACE) stack.push(c);
            if (c == LEFT_BRACKET) stack.push(c);

            if (c == RIGHT_PAREN) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_PAREN) return false;
            }
            if (c == RIGHT_BRACE) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACE) return false;
            }
            if (c == RIGHT_BRACKET) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACKET) return false;
            }
        }
        return true;
    }
}
