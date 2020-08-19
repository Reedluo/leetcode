package com.haynes.algotithms;

import edu.princeton.cs.introcs.In;

import java.util.Scanner;

/**
 * @descripton: 1.3.1.5 & 1.3.16 以readInts()作为模板为Date编写一个静态方法readDates()，
 * 从标准输入中读取由练习1.2.19的表格所指定的格式的多个日期并返回一个它们的数组
 * @author: yangheng
 * @date 2020-08-19 8:52
 **/
public class QueueExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        In in = new In(name);
        Queue<Integer> q = new Queue<>();
        while (!in.isEmpty()) {
            q.enqueue(in.readInt());
        }
        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = q.dequeque();
        }

        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
