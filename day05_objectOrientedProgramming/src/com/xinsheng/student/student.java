package com.xinsheng.student;

public class student {
    String name;
    double chinese;
    double math;

    public void allScore(){
        System.out.println("total = " + (chinese + math));
    }

    public void evenScore(){
        System.out.println("; even = " + ((chinese + math) / 2));
    }
}
