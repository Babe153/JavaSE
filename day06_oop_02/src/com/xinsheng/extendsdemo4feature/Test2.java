package com.xinsheng.extendsdemo4feature;

public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        z.run();//子类的run方法
    }
}

class Fu{
    String name = "FuName";
    public void run(){
        System.out.println("Fu的run方法");
    }
}

class Zi extends Fu{
    String name = "ZiName";

    public void show(){
        String name = "ShowName";
        System.out.println(name);//show的名字
        System.out.println(this.name);//Zi的名字
        System.out.println(super.name);//Fu的名字
        super.run();//父类的run方法
    }

    public void run() {
        System.out.println("子类的run方法");
    }
}