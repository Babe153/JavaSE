package com.xinsheng.cases;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("please enter second number");
        double num2 = sc.nextDouble();
        System.out.println("please enter the method(+ - * /)");
        String method = sc.next();
        math(num1 , num2 , method);
    }

    public static void math(double num1, double num2, String method) {
        double result;
        if(method.equals("+")){
            result = num1 + num2;
            System.out.println("result = " + result);
        }else if (method.equals("-")){
            result = num1 - num2;
            System.out.println("result = " + result);
        }else if (method.equals("*")){
            result = num1 * num2;
            System.out.println("result = " + result);
        }else if (method.equals("/")){
            result = num1 / num2;
            System.out.println("result = " + result);
        }else System.out.println("wrong method");
    }
}
