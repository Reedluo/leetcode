package com.haynes.practise;

import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age <= 12) {
            System.out.println("滚粗，小娃娃");
        } else if (age < 18) {
            System.out.println("校园少女");
        } else if (age < 30) {
            System.out.println("妙龄少女");
        } else if (age < 45) {
            System.out.println("多情熟女");
        } else if (age < 60) {
            System.out.println("老妈妈");
        }

        System.out.println("回家吧，该吃饭了");


    }

    public String jiabaonan(String name) {
        if (name.equals("杨很")) {
            return "请小心，这是一个家暴男";
        }else {
            return "请放心，这是一个渣男";
        }
    }
}
