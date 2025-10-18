package com.xinsheng.extendsdemo6constructor;

public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("小刘","男","Java");
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());
    }
}
