package com.xinsheng.twoArray;

public class twoArrayDemo {
    public static void main(String[] args) {
        printArray();
    }

    public static void printArray() {
        String[][] classroom = new String[][]{
                {"Tom","Jerry","Peter"},
                {"小明","小红"},
                {"王麻子","张三","李四","黄老爷"}
        };

        //访问：数组名[行索引]
        String[] names = classroom[2];
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
        System.out.println();

        //访问：数组名[行索引][列索引]
        String name = classroom[1][1];
        System.out.print(name);

        //动态初始化数组
        int[][] arr  = new int[3][5];
    }
}
