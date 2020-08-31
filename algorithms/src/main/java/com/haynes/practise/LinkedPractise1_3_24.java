package com.haynes.practise;


import com.haynes.algotithms.LinkedStack;
import com.haynes.algotithms.Stack;

/**
 * @Description: 1.3.24 編寫一個 removeAfter(),
 * 接受一个链表节点作为参数并删除该节点的后续节点（如果参数节点或参数节点的后续节点为空则什么也不做)。
 * @Param:
 * @return:
 * @Author: yangheng
 * @Date: 2020/8/23
 **/
public class LinkedPractise1_3_24 {
    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        for (int i = 0; i < 10; i++) {
            linkedStack.push(i);
        }
        removeAfter(linkedStack);
        for (Integer val : linkedStack) {
            System.out.print(val);
        }
    }

    private static void removeAfter(LinkedStack<Integer> linkedStack) {

    }
}
