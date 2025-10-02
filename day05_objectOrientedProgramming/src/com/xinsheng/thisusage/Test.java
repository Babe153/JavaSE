package com.xinsheng.thisusage;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "lxs";
        s1.printThis();
        System.out.println(s1);

        Student s2 = new Student();
        s2.name = "小刘";
        s2.printHobby("打游戏");
    }


}
