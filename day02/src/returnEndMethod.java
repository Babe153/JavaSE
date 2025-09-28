import java.util.Scanner;

public class returnEndMethod {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        max(a , b);
        System.out.println("If there is no max, then return break the method.");
    }

    public static void max(int a, int b) {
        if (a > b){
            int max = a;
            System.out.println("Max is " + a);
        }
        return;
    }
}
