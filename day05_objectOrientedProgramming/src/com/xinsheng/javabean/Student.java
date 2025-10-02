package com.xinsheng.javabean;
//Student.java

//JavaBean(也叫实体类)实例:

public class Student {

    //1.私有化成员变量
    private String name;
    private int age;
    private char gender;
    private double chinese;

    //2.提供一个无参构造器
    //如果不提供有参构造器 可以不手动提供无参构造器 因为类会自带一个无参构造器 这个构造器即可满足JavaBean要求
    public Student(){

    }

    //3.提供有参构造器
    public Student(String name, int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //4.为每个成员变量提供公开的getter和setter方法。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }
}
