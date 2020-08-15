package com.haynes.practise;

import com.haynes.algotithms.Stack;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class StackPratise1 {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<String>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (!s.equals("-")) {
                stacks.push(s);
            } else if (!stacks.isEmpty()) {
                StdOut.print(stacks.pop() + " ");
            }
        }
    }
}
