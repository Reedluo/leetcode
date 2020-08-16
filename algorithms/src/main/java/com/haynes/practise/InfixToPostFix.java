package com.haynes.practise;

import com.haynes.algotithms.Stack;
import edu.princeton.cs.introcs.StdIn;

/**
 * 1.3.10
 * 编写一个过滤器,将算术表达式由中序表达式转为后序表达式。
 */
public class InfixToPostFix {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "+":
                case "-":
                case "*":
                case "/":
                    stack.push(s);
                    break;
                case "(":
                    break;
                case ")":
                    System.out.print(stack.pop() + " ");
                    break;
                default:
                    System.out.print(s + " ");
            }
        }
        System.out.println();
    }
}
