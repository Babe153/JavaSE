package com.xinsheng.extendsdemo5override;

public class Test {
    public static void main(String[] args) {
        //目标：认识方法重写
        Cats c = new Cats();
        c.cry();
    }
}

class Animal{
    public void cry(){
        System.out.println("Animal voice");
    }
}

class Cats extends Animal{
    @Override //方法重载的校验注解 要求方法名称和形参列表必须与被重写方法一致 否则报错 可读性更强 更安全 更优雅
    public void cry(){
        System.out.println("Cats voice");
    }
    //重载
}
