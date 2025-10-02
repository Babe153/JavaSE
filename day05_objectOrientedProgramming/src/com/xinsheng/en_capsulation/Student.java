package com.xinsheng.en_capsulation;

public class Student {
    private String name;
    private int age;
    private char gender;

    public void setAge(int age){
        if (age > 0 && age < 200){
            this.age = age;
        }else {
            System.out.println("invalid age number");
        }
    }

    public int getAge() {
        return age;
    }
}
