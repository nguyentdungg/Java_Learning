package Lab3;

import java.util.Scanner;

public class Ex3_BCC {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int a = scanner.nextInt();

        System.out.println("Bảng cửu chương của số " + a);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", a, i, a * i);
        }
    }
}
