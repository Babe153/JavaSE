package com.xinsheng.scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        type();
    }

    public static void type() {
        Scanner sc = new Scanner(System.in);
        System.out.println("您的名字是：");
        String name = sc.next();
        System.out.println(name);
    }
}
