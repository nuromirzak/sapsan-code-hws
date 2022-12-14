package december14;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        char res = getSign(a, b);
        System.out.println("Result: " + res);
    }

    private static char getSign(int a, int b) {
        return a > b ? '>' : a < b ? '<' : '=';
    }
}
