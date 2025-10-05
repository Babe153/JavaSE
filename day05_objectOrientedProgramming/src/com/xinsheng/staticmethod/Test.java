package com.xinsheng.staticmethod;

//Test.java
public class Test {
    public static void main(String[] args) {
        Student.printHelloWorld(); //类名.静态方法名

        Student s1 = new Student();
        s1.setScore(59.5);
        s1.printPass(); //对象名.实例方法
    }
}