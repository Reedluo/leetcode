package com.haynes.temp;


import com.haynes.algotithms.Stack;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class temp1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            list.add(i);
        }

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }
        int size = stack.size();
        System.out.println(size);

        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            System.out.println(next);
            iterator1.remove();
        }
        int size1 = list.size();
        System.out.println(size1);
    }
}
