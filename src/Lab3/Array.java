package Lab3;

import java.util.Scanner;

public class Array {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("\nTổng các số nguyên trong mảng = " + sum);
    }
}
