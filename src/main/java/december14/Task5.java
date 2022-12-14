package december14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        List<Integer> primes = getPrimesBetween(a, b);
        System.out.println("Result: " + primes);
    }

    private static List<Integer> getPrimesBetween(int a, int b) {
        List<Integer> res = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) res.add(i);
        }
        return res;
    }
}
