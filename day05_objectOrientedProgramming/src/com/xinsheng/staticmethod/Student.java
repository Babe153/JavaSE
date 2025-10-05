package com.xinsheng.staticmethod;

//Student.java
public class Student {
    private double score;
    //1.静态方法：有static修饰 属于类本身
    public static void printHelloWorld(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //2.实例方法 没有static修饰 属于对象持有
    public void printPass(){
        System.out.println(score >= 60 ? "pass" : "fail");
    }
}
