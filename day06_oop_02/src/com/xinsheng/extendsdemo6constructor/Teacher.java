package com.xinsheng.extendsdemo6constructor;

public class Teacher extends People{
    private String skill;

    public Teacher(){
    }

    public Teacher(String name, String sex,String skill) {
        super(name,sex);//调用父类构造器，其实你写不写都可以，因为子类构造器即使没有super(),java也会为它添加一个super(),用来调用父类的无参构造器
        //要用super调用父类的有参构造器 记得要赋值！！！
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
