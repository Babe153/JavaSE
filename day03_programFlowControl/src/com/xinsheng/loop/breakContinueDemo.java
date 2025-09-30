package com.xinsheng.loop;

public class breakContinueDemo {
    public static void main(String[] args) {

    }

    //写一个方法演示break和continue的区别
    public static void breakAndContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // 当i等于5的时候，跳出循环
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // 当i等于5的时候，跳过当前循环，继续下一次循环
            }
            System.out.println(i);
        }
    }
}
