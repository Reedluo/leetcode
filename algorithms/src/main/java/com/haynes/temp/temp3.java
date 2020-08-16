package com.haynes.temp;

import com.haynes.algotithms.Stack;

public class temp3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        Stack<String> copy = Stack.copy(stack);
        while (!copy.isEmpty()) {
            System.out.println(copy.pop());
        }
    }
}
