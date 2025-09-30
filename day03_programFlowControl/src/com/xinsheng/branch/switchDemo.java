package com.xinsheng.branch;

public class switchDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        String day = "Mon";
        switch (day){
            case "Mon":
                System.out.println("Mon");
                break;
            case "Tue":
                System.out.println("Tue");
                break;
            case "Wed":
                System.out.println("Wed");
                break;
            case "Thur":
                System.out.println("Thur");
                break;
            case "Fri":
                System.out.println("Fri");
                break;
            default:
                System.out.println("weekend");

        }
        for (int i = 0; i <= 2 ; i++){
            System.out.println("hello world");
        }
    }
}
