package com.xinsheng.loop;

public class whileInterest {
    public static void main(String[] args) {
        double money = 100000;
        double rate = 0.017;
        interest(money, rate);
    }

    public static void interest(double money, double rate) {
        double goal = money * 2;
        int year = 0;
        while (money < goal){
            money += money * rate;
            year++;
        }
        System.out.println(year);
    }
}
