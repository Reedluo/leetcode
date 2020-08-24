package com.haynes.practise;

import edu.princeton.cs.algs4.LinkedQueue;
import edu.princeton.cs.algs4.LinkedStack;

/**
 * @Description:  1.3.21 编写一个方法find()，接受一条链表和一个字符串key作为参数。
 * 如果链表中的某个节点的item域的值为key，则方法返回true，否则返回false.
 * @Param:
 * @return:
 * @Author: yangheng
 * @Date: 2020/8/23
 **/
public class LinkedPractise1_3_21 {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        boolean flag = find(stack, 5);
        System.out.println(flag);
    }

    private static boolean find(LinkedStack<Integer> stack, int key) {
        for (Integer integer : stack) {
            if (integer == key) {
                return true;
            }
        }
        return false;
    }

}
