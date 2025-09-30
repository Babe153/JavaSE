package com.xinsheng.cases;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        System.out.println("guess number");
        int num = enter();
        guess(num);
    }

    public static int enter() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
    public static void guess(int num) {
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        while (true) {
            if (num < randNum) {
                System.out.println("small");
                num = enter(); // 更新num的值
            } else if (num > randNum) {
                System.out.println("big");
                num = enter(); // 更新num的值
            } else {
                System.out.println("bingo");
                break;
            }
        }
    }

}
