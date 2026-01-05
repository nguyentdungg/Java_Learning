package Lab2;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số điện: ");
        int soDien = scanner.nextInt();
        int soTien = 0;
        if (soDien > 0 && soDien <= 100) soTien = soDien * 1000;
        else if (soDien > 100) soTien = 100 * 1000 + (soDien - 100) * 1500;

        System.out.println("Số tiền điện = " + soTien);
    }
}
