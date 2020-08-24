package com.haynes.practise;

import com.haynes.algotithms.Stack;

/**
 * @descripton: 1.3.20编写一个方法delete()，接受一个int参数k，删除链表的第k个元素（如果它存在的话）
 * @author: yangheng
 * @date 2020-08-21 08:40
 **/
public class LinkedPractise1_3_20 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.deleteByk2(1));

        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println(stack.size());
    }
}
