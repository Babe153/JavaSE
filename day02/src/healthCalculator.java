import java.util.Scanner;

public class healthCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter your gender(male/female):");
        Scanner sc = new Scanner(System.in);
        String gender = sc.next();
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        System.out.println("Please enter your body weight(kg):");
        double weight = sc.nextDouble();
        System.out.println("Please enter your height(m):");
        double height = sc.nextDouble();
        if("male".equals(gender)){
            male(weight ,height, age);
        }
        else {
            female(weight ,height, age);
        }

    }

    public static void male(double weight , double height, int age) {
        double bmi = weight / (height * height);
        double bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        if(bmi < 18.5){
            System.out.println("BMI = " + bmi + "body weight low");
        } else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("BMI = " + bmi + "body weight normal");
        } else if (25 <= bmi && bmi <= 29.9) {
            System.out.println("BMI = " + bmi + "overweight");
        } else if (bmi >= 30) {
            System.out.println("BMI = " + bmi + "fat pig");
        }

        //space
        if(bmr >=1500 && bmr <=2500){
            System.out.println("BMR = " + bmr + "bmr normal");
        }else System.out.println("BMR = " + bmr + "bmr unnormal");
    }

    public static void female(double weight , double height, int age) {
        double bmi = weight / (height * height);
        double bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        if(bmi < 18.5){
            System.out.println("BMI = " + bmi + "body weight low");
        } else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("BMI = " + bmi + "body weight normal");
        } else if (25 <= bmi && bmi <= 29.9) {
            System.out.println("BMI = " + bmi + "overweight");
        } else if (bmi >= 30) {
            System.out.println("BMI = " + bmi + "fat pig");
        }

        //space
        if(bmr >=1200 && bmr <=2000){
            System.out.println("BMR = " + bmr + "bmr normal");
        }else System.out.println("BMR = " + bmr + "bmr unnormal");
    }
}
