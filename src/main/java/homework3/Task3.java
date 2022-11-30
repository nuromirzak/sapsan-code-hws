package homework3;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 2, j = 0; i <= 20; i += 2, j++) {
            arr[j] = i;
        }
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        System.out.println(sum);
    }
}
