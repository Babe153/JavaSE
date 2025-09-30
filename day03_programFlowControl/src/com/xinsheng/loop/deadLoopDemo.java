package com.xinsheng.loop;

public class deadLoopDemo {
    public static void main(String[] args) {
        deadloop();
    }

    public static void deadloop() {
        //1.for循环
//        for (;;){
//            System.out.println("hello world");
//        }
        //2.while循环
//        while (true){
//            System.out.println("my name");
//        }
        //3.do while循环
        do {
            System.out.println("your name");
        }while (true);
    }
}
//测试一个死循环时需要将其余两个注释掉，否则例如for循环一直在执行，代码会认为while循环与do while循环是不可触达的代码
//因此会触发报错，并非语法问题