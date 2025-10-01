package com.xinsheng.constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小明",18,'男');
        System.out.println(s1.name + s1.age + s1.sex);
        System.out.println(s1);
    }
}
