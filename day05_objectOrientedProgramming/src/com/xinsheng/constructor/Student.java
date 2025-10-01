package com.xinsheng.constructor;

public class Student {
    String name;
    int age;
    char sex;

    //无参构造器
    public Student(){

    }

    //有参构造器
    public Student(String n, int a, char s){
        name = n;
        age = a;
        sex = s;
    }
}
