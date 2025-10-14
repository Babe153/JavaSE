package com.xinsheng.extendsdemo2modifier;

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu f = new Fu();
        //f.privateMethod(); //不能访问
        f.method(); //可以访问
        f.protectedMethod(); //可以访问
        f.publicMethod(); //可以访问
    }
}