package december14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        boolean ans = getFrequent(a == 1, b == 1, c == 1);
        System.out.println("Result: " + ans);
    }

    private static boolean getFrequent(boolean a, boolean b, boolean c) {
        return (a && b) || (b && c) || (a && c);
    }
}
