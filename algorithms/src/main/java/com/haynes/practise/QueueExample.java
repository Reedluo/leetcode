package com.haynes.practise;

import com.haynes.algotithms.Queue;
import edu.princeton.cs.introcs.StdIn;

import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Queue<String> q = new Queue<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            q.enqueue(s);
        }

        String target = findk(q, k);
        System.out.println(target);
    }

    private static String findk(Queue<String> q, int k) {
        while (q.size() != k) {
            q.dequeque();
        }
        return q.dequeque();
    }
}
