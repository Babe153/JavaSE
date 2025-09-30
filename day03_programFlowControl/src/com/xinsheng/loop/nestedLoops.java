package com.xinsheng.loop;

public class nestedLoops {
    public static void main(String[] args) {
        star();
        //打印4行5列星星
    }

    public static void star() {
        for (int i = 0; i < 4; i++) {  //控制行数
            for (int j = 0; j < 5; j++) {  //控制列数
                System.out.print('*'); //不换行打印 连续打印5个（5列）
            }
            System.out.println(); //换行
        }
    }
}
