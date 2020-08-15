package com.haynes.practise;

import com.haynes.algotithms.Stack;
import edu.princeton.cs.introcs.StdIn;

public class Parentheses {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            Stack<String> left = new Stack<String>();
            Stack<String> right = new Stack<String>();
            String item = StdIn.readString();
            String[] items = item.split("");
            for (String s : items) {
                if (s.equals("[") || s.equals("{") || s.equals("(")) {
                    left.push(s);
                }else {
                    right.push(s);
                }
            }
            edu.princeton.cs.algs4.Stack
            for (String l : left) {
                String temp = "";
                if (l.equals("[")) {
                    temp = "]";
                } else if (l.equals("{")) {
                    temp = "}";
                } else if (l.equals("(")) {
                    temp = ")";
                }
                for (String r : right) {
                    if (r.equals(temp)) {

                    }
                }
            }
        }
    }
}
