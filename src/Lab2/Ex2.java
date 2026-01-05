package Lab2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0 && c == 0)
                System.out.println("Phương trình có vô số nghiệm!");
            else if (b == 0 && c != 0)
                System.out.println("Phương trình vô nghiệm!");
            else {
                double x = -(double) c / b;
                System.out.println("Nghiệm của phương trình: " + x);
            }
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0)
                System.out.println("Phương trình vô nghiệm");
            else if (delta == 0) {
                double x = -b / (2.0 * a);
                System.out.println("Phương trình có nghiệm kép: " + x);
            } else if (delta > 0) {
                double x1 = (-b + sqrt(delta)) / (2 * a);
                double x2 = (-b - sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt :");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        scanner.close();
    }
}
