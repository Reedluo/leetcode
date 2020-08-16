package com.haynes.temp;

import com.haynes.algotithms.Stack;
import edu.princeton.cs.introcs.StdOut;

public class temp2 {
    public static void main(String[] args) {
        int N = 50;
        Stack<Integer> stack = new Stack<Integer>();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for (Integer d : stack) {
            StdOut.println(d);
        }
    }
}
