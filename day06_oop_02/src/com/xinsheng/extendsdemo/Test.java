package com.xinsheng.extendsdemo;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("Tom");
        t.setSkill("Java C++ UnrealEG");
        t.setSex('男');

        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());
    }
}
