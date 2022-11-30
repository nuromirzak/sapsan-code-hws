package homework3;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[99];
        for (int i = 0; i < 99; i++) {
            arr[i] = i + 1;
        }
        for (int elem :arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
