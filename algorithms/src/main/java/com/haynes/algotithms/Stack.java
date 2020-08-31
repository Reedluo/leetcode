package com.haynes.algotithms;

import edu.princeton.cs.algs4.LinkedStack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author yangheng
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item> {
    private int N;
    private Node first;

    public class Node{
        Item item;
        Node next;
    }

    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underfolw");
        }
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public boolean isEmpty() {
        return N == 0;
    }


    public int size() {
        return N;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return this.first.item;
    }

    public Item deleteLast() {
        Node current = first;
        Item item = null;
        if (isEmpty()) {
            return null;
        }
        while (current.next != null) {
            if (current.next.next == null) {
                item = current.next.item;
                current.next = null;
                this.N--;
                break;
            }
            current = current.next;

        }
        return item;
    }

    public Item deleteByk(int k) {
        if (k > N || k <= 0) {
            return null;
        }
        Node current = first;
        Node pre = null;
        int index = 0;
        while (current.next != null && index < k - 1) {
            pre = current;
            current = current.next;
            index++;
        }
        if (pre == null) {
            first = current.next;
            N--;
        } else if (current.next != null) {
            pre.next = current.next;
            N--;
        }else {
            pre.next = null;
            N--;
        }
        return current.item;
    }
    //

    public Item deleteByk2(int k) {
        Item item = null;
        if (k > N || k <= 0 || first == null) {
            return null;
        }
        if (k == 1) {
            item = first.item;
            first = first.next;
            N--;
            return item;
        }

        Node current = first;
        k--;
        while (current.next != null && --k !=0) {
            current = current.next;
        }
        if (current.next != null) {
            item = current.next.item;
            current.next =current.next.next;
            N--;
            return item;
        }
        return null;
  }

    public Node getFirst() {
        return first;
    }

    public int max(Node first) {
        if (first == null) {
            return 0;
        }
        int max = (Integer) first.item;
        Node current = first;
        while (current.next != null) {
            current = current.next;
            if ((Integer)current.item > max) {
                max = (Integer) current.item;
            }
        }
        return max;
    }

    public int maxOfRecursion(Node first) {
        if (first == null) {
            return 0;
        }
        if (first.next == null) {
            return (Integer) first.item;
        }
        int max = (Integer) first.item;
        if (max > (Integer) first.next.item) {
            first.next = first.next.next;
            return maxOfRecursion(first);
        }
        return maxOfRecursion(first.next);
    }

    public static <Item> Stack<Item> copy(Stack<Item> stack) {
        Iterator<Item> iterator = stack.iterator();
        Stack<Item> temp = new Stack<>();
        Stack<Item> result = new Stack<>();

        while (iterator.hasNext()) {
            temp.push(iterator.next());
        }
        iterator = temp.iterator();
        while (iterator.hasNext()) {
            result.push(iterator.next());
        }
        return result;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Item> {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            Stack.this.pop();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String next = s.next();
        String[] content = next.split(",");
        Stack<String> stack = new Stack();
        for (String s1 : content) {
            if (!s1.equals("-")) {
                stack.push(s1);
            } else if (!stack.isEmpty()) {
                String pop = stack.pop();
                System.out.print(pop + " ");
            }
        }
        System.out.println("stack size: " + stack.size());


    }
}
