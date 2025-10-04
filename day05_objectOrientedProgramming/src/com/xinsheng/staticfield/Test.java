package com.xinsheng.staticfield;
//Test.java

public class Test {
    public static void main(String[] args) {
        Student.name = "小明";
        System.out.println(Student.name);


        Student s1 = new Student();
        s1.name = "小红"; //不推荐这样定义静态变量，仅作演示，请使用类名.静态变量名称进行访问和修改
        //s1.printName();

        Student s2 = new Student();
        s2.name = "小黄";
        s2.printName(); //结果为小黄
        s1.printName(); //结果为小黄
        //因为name为静态变量 类中只有一份 内存中也只有一份储存空间 所以修改的是一个东西

        s1.age = 18;
        s2.age = 20;
        s1.printAge();
        s2.printAge();
        //age为对象的变量 所以每个对象内存中都有一个age内存 所以打印出来不一样
    }
}
