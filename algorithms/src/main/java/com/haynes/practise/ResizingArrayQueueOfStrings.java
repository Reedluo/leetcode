package com.haynes.practise;

/**
 * 1.3.14
 * 编写一个类，使用定长数组实现队列的抽象，然后扩展实现，
 * 使用调整数组的方法突破大小的限制
 */
public class ResizingArrayQueueOfStrings {
    private String[] a = new String[1];
    private Integer n = 0;

    private int coefficient = 2;

    private void resize(int max) {
        String[] temp = new String[max];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        a = temp;
        System.out.println("resize, size:" + a.length);
    }

    public void enqueue(String item) {
        if (n == a.length) {
            resize(coefficient * a.length);
        }
        a[n++] = item;

    }


    public String dequeque() {
        String item = a[0];
        for (int i = 0; i < n; i++) {
            a[i] = a[i+1];
        }
        n--;
        if (n > 0 && n <= a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    public static void main(String[] args) {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();
        for (int i = 0; i < 100; i++) {
            queue.enqueue(String.valueOf(i));
        }
        for (int i = queue.n; i >= 0; i--) {
            queue.dequeque();
        }
    }

}
