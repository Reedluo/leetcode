package com.haynes.algotithms;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class bag {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        while (!StdIn.isEmpty()) {
            if (StdIn.readDouble() == 99) {
                break;
            }
            numbers.add(StdIn.readDouble());
        }
        int N = numbers.size();

        double sum = 0.0;
        for (Double x : numbers) {
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (Double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }
}
