package homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n], arr2 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = in.nextInt();
        for (int i = 0; i < n; i++) arr2[i] = in.nextInt();

        int compare = countArraysUsingStream(arr1, arr2);

        if (compare > 0) {
            System.out.println("Количество положительных чисел в первом массиве больше");
        } else if (compare < 0) {
            System.out.println("Количество положительных чисел во втором массиве больше");
        } else {
            System.out.println("Числа равны");
        }
    }

    private static int countArraysUsingStream(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).filter(x -> x > 0).sum() - Arrays.stream(arr2).filter(x -> x > 0).sum();
    }
}
