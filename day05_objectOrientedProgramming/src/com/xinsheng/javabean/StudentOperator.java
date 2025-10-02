package com.xinsheng.javabean;

//StudentOperator.java
public class StudentOperator {
    private Student s;

    //public StudentOperator(Student s){
    //    this.s = s;
    //}

    public void setS(Student s) {
        this.s = s;
    }

    public void printSum(){
        System.out.println(s.getName());
    }
}
