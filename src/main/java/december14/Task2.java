package december14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int b = in.nextInt();
        double res = power(a, b);
        System.out.println("Result: " + res);
    }

    private static double power(double a, int b) {
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }
}
