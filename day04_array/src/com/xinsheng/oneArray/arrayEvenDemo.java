package com.xinsheng.oneArray;

import java.util.Scanner;

public class arrayEvenDemo {
    public static void main(String[] args) {
        even();
    }

    public static void even() {
        double[] arr = new double[8];
        Scanner sc = new Scanner(System.in);

        //遍历输入数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        //求平均分
        double all = 0;
        for (int i = 0; i < arr.length; i++) {
            double index = arr[i];
            all += index;
        }
        System.out.println("even score is " + all/arr.length);

        //求最高分
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max score is " + max);

        //求最低分
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min score is " + min);
    }
}
