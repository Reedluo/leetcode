package com.haynes.algotithms;

public class Queue<Item> {
    private Node first;
    private Node last;
    private int N;

    public class Node {
        Node next;
        Item item;
    }

    public boolean isEmpty() {
        return N == 0 || first == null;
    }

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        }else {
            oldLast.next = last;
        }
        N++;
    }

    public Item dequeque() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.enqueue("hello");
        String dequeque = queue.dequeque();
        System.out.println(dequeque);
    }



}
