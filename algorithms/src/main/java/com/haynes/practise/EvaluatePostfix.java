package com.haynes.practise;

import com.haynes.algotithms.Stack;
import edu.princeton.cs.introcs.StdIn;

/**
 * 1.3.11
 * 编写一段程序，从标准输入中得到一个后序表达式，求值并打印结果
 */
public class EvaluatePostfix {
    private static final String add = "+";
    private static final String reduce = "-";
    private static final String mult = "*";
    private static final String div = "/";

    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals(add)) {
                double val = Double.parseDouble(stringStack.pop()) + Double.parseDouble(stringStack.pop());
                stringStack.push(String.valueOf(val));
            } else if (s.equals(reduce)) {
                double val = Double.parseDouble(stringStack.pop()) - Double.parseDouble(stringStack.pop());
                stringStack.push(String.valueOf(val));
            } else if (s.equals(mult)) {
                double val = Double.parseDouble(stringStack.pop()) * Double.parseDouble(stringStack.pop());
                stringStack.push(String.valueOf(val));
            } else if (s.equals(div)) {
                double val = Double.parseDouble(stringStack.pop()) / Double.parseDouble(stringStack.pop());
                stringStack.push(String.valueOf(val));
            }else {
                stringStack.push(s);
            }
        }

        System.out.println(stringStack.pop());

    }
}
