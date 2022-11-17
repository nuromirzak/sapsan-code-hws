package homework1;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        System.out.print("Enter your waist circumference in cm: ");
        double waistCircumference = sc.nextDouble();

        System.out.print("Enter your sex (FEMALE/MALE): ");
        String str = sc.next();

        Sex sex = null;
        if (str.equals("MALE")) sex = Sex.MALE;
        else if (str.equals("FEMALE")) sex = Sex.FEMALE;

        double bodyFatPercentage = BodyFatPercentageCalculator.calculate(height, waistCircumference, sex);

        System.out.println("Your body fat percentage is: " + bodyFatPercentage + "%");
    }
}
