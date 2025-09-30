package com.xinsheng.loop;

public class forSumDemo {
    public static void main(String[] args) {
        sum();
        System.out.println("=================================================");
        int num = 10;
        sum(num);
    }

    public static void sum() {
        System.out.println("sum from 1 to 5 is:");
        int num = 0;
        int sum = 0;
        for (int i = 0; i < 5 ; i++){
            num++;
            sum += num;
        }
        System.out.println(sum);
    }

    public static void sum(int num) {
        int sum = 1;
        int index = 1;
        for (int i = 1; i < 9; i+=2){
            index += 2;
            sum += index;
        }
        System.out.println(sum);
    }
}
