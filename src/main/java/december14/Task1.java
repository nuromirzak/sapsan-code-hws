package december14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        int min = findMin(a, b, c, d);
        System.out.printf("Min: %d\n", min);
    }

    private static int findMin(int... args) {
        int min = Integer.MAX_VALUE;
        for (int arg : args) {
            min = Math.min(min, arg);
        }
        return min;
    }
}
