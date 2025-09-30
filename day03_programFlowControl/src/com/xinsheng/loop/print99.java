package com.xinsheng.loop;

public class print99 {
    public static void main(String[] args) {
        print99();
    }

    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            //控制行数
            for (int j = 1; j <= i; j++) {
                //控制列数
                System.out.print(i + "X" + j + "=" + (i * j) + "\t");
            }
            System.out.println();//换行
        }
    }
}
