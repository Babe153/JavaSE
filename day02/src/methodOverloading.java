import java.util.Scanner;

public class methodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sum((int)a,(int)b);
        sum(a,b);

    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void sum(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }
}
