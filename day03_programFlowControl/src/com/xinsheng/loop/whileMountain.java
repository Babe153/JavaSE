package com.xinsheng.loop;

public class whileMountain {
    public static void main(String[] args) {
        double height = 8848860;
        double thick = 0.1;
        mountain(height, thick);
    }

    public static void mountain(double height, double thick) {
        int index = 0;
        while (thick < height){
            thick *= 2;
            index++;
        }
        System.out.println(index);
    }
}
