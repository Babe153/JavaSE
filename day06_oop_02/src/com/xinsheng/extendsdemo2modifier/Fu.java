package com.xinsheng.extendsdemo2modifier;

public class Fu {

    //private修饰符
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    //缺省修饰符
    void method(){
        System.out.println("method");
    }

    //protected修饰符
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    //public修饰符
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod(); //可以访问
        f.method(); //可以访问
        f.protectedMethod(); //可以访问
        f.publicMethod(); //可以访问
    }
}
