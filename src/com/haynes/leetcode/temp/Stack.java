package com.haynes.leetcode.temp;

import java.util.Scanner;

public class Stack<Item> {
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String next = s.next();
        String[] content = next.split(",");
        Stack<String> stack = new Stack<>();
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
