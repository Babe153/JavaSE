package com.xinsheng.staticfield;
//Student.java

public class Student {
    //1.静态变量（类变量）
    //有static修饰，属于类的变量，在计算机内存中只有一份，被类里的所有对象共享
    static String name;

    //2.实例变量（对象的变量）
    //没有static修饰，属于每一个对象的变量
    int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName(){
        System.out.println(Student.name);
    }

    public void printAge(){
        System.out.println(this.age);
    }
}
