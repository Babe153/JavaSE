package com.xinsheng.extendsdemo6constructor;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu{
    public Fu(){
        System.out.println("父类构造器");
    }
}

class Zi extends Fu{
    public Zi(){
        System.out.println("子类构造器");
    }
}