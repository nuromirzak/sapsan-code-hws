package homework3;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 2, j = 0; i <= 20; i += 2, j++) {
            arr[j] = i;
        }
        for (int elem :arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
