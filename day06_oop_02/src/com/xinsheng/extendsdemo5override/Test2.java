package com.xinsheng.extendsdemo5override;

public class Test2 {
    public static void main(String[] args) {
        //目标：子类重写Object的toString方法，以便返回对象的内容。
        Student s = new Student("小刘",'男',18);
        System.out.println(s);//没有重写toString方法时 这里调用Object类的toString方法 返回一个地址
        //相当于System.out.println(s.toString());
    }
}

class Student{
    private String name;
    private char sex;
    private int age;

    @Override //重写override方法
    public String toString(){
        return "Student{name =" + name + ",sex=" + sex + ",age=" + age;
    }

    public Student(){
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
