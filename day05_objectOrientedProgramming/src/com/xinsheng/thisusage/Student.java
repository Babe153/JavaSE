package com.xinsheng.thisusage;

public class Student {
    String name;

    public void printThis(){
        System.out.println(this);
    }

    public void printHobby(String name){
        System.out.println(this.name + "like" + name);
    }
}
