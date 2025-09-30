package com.xinsheng.cases;

import java.util.Random;
import java.util.Scanner;

public class vaildString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(validNum(num));
    }
    public static String validNum(int num) {
        String code = "";
        for (int i = 0; i < num; i++) {
            Random r = new Random();
            int codeNumber = r.nextInt(3);
            switch (codeNumber){
                case 0:
                    int number =(int)(Math.random() * 10); //Math.random()生成一个[0.0, 1.0) 前闭后开的数字范围
                    code += number;
                    break;
                case 1:
                    int number1 =(int)(Math.random() * 26);
                    char ch = (char)('A' + number1);
                    code += ch;
                    break;
                case 2:
                    int number2 =(int)(Math.random() * 26);
                    char ch2 = (char)('a' + number2);
                    code += ch2;
                    break;
                default:
                    System.out.println("error");
            }
        }
        return code;
    }
}
