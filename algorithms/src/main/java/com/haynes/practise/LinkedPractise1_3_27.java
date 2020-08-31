package com.haynes.practise;

import com.haynes.algotithms.LinkedStack;
import com.haynes.algotithms.Stack;

import java.util.Random;

/**
 * @descripton: 编写一个方法max(), 接受一条链表的首结点作为参数，
 * 返回链表中最大的节点的值。假设所有键均为正整数，如果链表为空则返回0。
 * @author: yangheng
 * @date 2020-08-24 09:12
 **/
public class LinkedPractise1_3_27 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            stack.push(r.nextInt(1000));
        }

        Stack<Integer>.Node first = stack.getFirst();
        int max1 = stack.max(first);
        System.out.println(max1);

    }

}
