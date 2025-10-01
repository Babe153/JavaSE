package com.xinsheng.student;

public class evenStudent {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.name = "播妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.allScore();
        s1.evenScore();

        s2.name = "播仔";
        s2.chinese = 59;
        s2.math = 100;
        s2.allScore();
        s2.evenScore();
    }

}
