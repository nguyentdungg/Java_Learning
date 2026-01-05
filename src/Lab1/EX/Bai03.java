package Lab1.EX;

import java.util.Scanner;

public class Bai03 {
    static void main() {
        System.out.println("Run bài 03");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cạnh của khối lập phương: ");
        int canh = scanner.nextInt();

        System.out.println("Thể tích của hình lập phương = " + Math.pow(canh, 3));

        scanner.close();
    }
}
