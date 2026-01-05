package Lab3;

import java.util.Scanner;

public class Ex2_Prime {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên: ");
        int a = scanner.nextInt();

        boolean check = true;
        if (a < 2) check = false;
        else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) System.out.println(a + " là số nguyên tố");
        else System.out.println(a + " không là số nguyên tố");
        scanner.close();
    }
}
