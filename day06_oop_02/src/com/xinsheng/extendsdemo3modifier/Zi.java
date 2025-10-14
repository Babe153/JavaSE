package com.xinsheng.extendsdemo3modifier;

import com.xinsheng.extendsdemo2modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu f = new Fu();
        //f.privateMethod(); //不能访问
        //f.method(); //不能访问 没有修饰符 只能同一个包中的类访问
        //f.protectedMethod(); //不能访问 protected修饰符 只能同一个包中的类 以及子孙类访问
        f.publicMethod(); //可以访问
    }
}
