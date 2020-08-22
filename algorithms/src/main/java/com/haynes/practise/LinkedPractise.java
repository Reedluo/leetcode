package com.haynes.practise;

import com.haynes.algotithms.Stack;
import edu.princeton.cs.introcs.StdIn;

import java.util.Iterator;

/**
 * @descripton: 1.3.19 给出一段代码，删除链表的尾节点，其中链表的首节点为first
 * @author: yangheng
 * @date 2020-08-20 09:03
 **/
public class LinkedPractise {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            stack.push(s);
        }
        for (String s : stack) {
            System.out.print(s + " ");
        }
        System.out.println("size: " + stack.size());

        stack.deleteLast();
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("size: " + stack.size());
    }
}
