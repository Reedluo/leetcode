package com.haynes.practise;

import com.haynes.algotithms.Queue;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @descripton: 1.3.29 用环形链表实现Queue。环形链表也是一条链表，只是没有任何结点的链接为空，
 * 且只要链表非空则last.next的值为first。只能使用一个Node类型的实例变量（last)。
 * @author: yangheng
 * @date 2020-08-25 09:23
 **/
public class CirCleQueue<Item> implements Iterable<Item>{
    private Node last;
    private int N;

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    /**
     * Performs the given action for each element of the {@code Iterable}
     * until all elements have been processed or the action throws an
     * exception.  Unless otherwise specified by the implementing class,
     * actions are performed in the order of iteration (if an iteration order
     * is specified).  Exceptions thrown by the action are relayed to the
     * caller.
     *
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified action is null
     * @implSpec <p>The default implementation behaves as if:
     * <pre>{@code
     *     for (T t : this)
     *         action.accept(t);
     * }</pre>
     * @since 1.8
     */
    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    /**
     * Creates a {@link Spliterator} over the elements described by this
     * {@code Iterable}.
     *
     * @return a {@code Spliterator} over the elements described by this
     * {@code Iterable}.
     * @implSpec The default implementation creates an
     * <em><a href="Spliterator.html#binding">early-binding</a></em>
     * spliterator from the iterable's {@code Iterator}.  The spliterator
     * inherits the <em>fail-fast</em> properties of the iterable's iterator.
     * @implNote The default implementation should usually be overridden.  The
     * spliterator returned by the default implementation has poor splitting
     * capabilities, is unsized, and does not report any spliterator
     * characteristics. Implementing classes can nearly always provide a
     * better implementation.
     * @since 1.8
     */
    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    public class QueueIterator implements Iterator<Item>{
        private Node current = last;
        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return current != null;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    public class Node {
        Node next;
        Item item;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    /**
     * 入列
     * @param item
     */
    public void enqueue(Item item) {
        Node oldNode = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            last.next = last;
        }else {
            last.next = oldNode.next;
            oldNode.next = last;
        }
        N++;
    }

    /**
     * 出列
     * @return
     */
    public Item dequeque() {
        Item item = last.next.item;
        N--;
        if (isEmpty()) {
            last = null;
        }else {
            last.next = last.next.next;
        }
        return item;
    }

    public static void main(String[] args) {
        CirCleQueue<Integer> queue = new CirCleQueue<>();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.dequeque();
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
