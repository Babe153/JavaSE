package com.xinsheng.javabean;
//Test.java

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("小明");
        s1.setGender('男');
        s1.setChinese(80);

        StudentOperator so1 = new StudentOperator();

        //StudentOperator so1 = new StudentOperator(s1);

        so1.setS(s1);
        so1.printSum();

    }
}
