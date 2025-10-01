package com.xinsheng.object;

import javax.xml.stream.events.StartDocument;

public class test {
    public static void main(String[] args) {
        star s1 = new star();
        s1.name = "彭于晏";
        s1.age = 43;
        s1.gender = "male";
        s1.height = 182;
        s1.weight = 75;
        System.out.println(s1.name);

    }
}
