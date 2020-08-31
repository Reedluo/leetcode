package com.haynes.practise;

import com.haynes.algotithms.Stack;

import java.util.Random;

/**
 * @descripton: 1.3.28 用递归的方法解答1.3.27
 * @author: yangheng
 * @date 2020-08-25 08:22
 **/
public class LinkedPractise1_3_28 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            stack.push(r.nextInt(1000));
        }

        Stack<Integer>.Node first = stack.getFirst();
        int max1 = stack.maxOfRecursion(first);
        System.out.println(max1);
    }
}
