package com.xinsheng.oneArray;

public class arrayDemo {
    public static void main(String[] args) {
        randomName();
    }

    public static void randomName() {
        String[] names = new String[]{"喜羊羊","美羊羊","懒羊羊","沸羊羊"};
        int index = (int)(Math.random() * names.length);
        System.out.println(names[index]);
    }
}
//dawdaw