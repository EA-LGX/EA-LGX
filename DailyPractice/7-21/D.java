import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j = 0;
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
