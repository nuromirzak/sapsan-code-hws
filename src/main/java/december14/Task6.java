package december14;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int min = 999, max = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            int randomNum = (int) (Math.random() * 1000);
            array[i] = randomNum;
            sum += randomNum;
            min = Math.min(min, randomNum);
            max = Math.max(max, randomNum);
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + (double) sum / array.length);
    }
}
