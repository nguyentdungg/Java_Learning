package Lab2;

import java.util.Scanner;

public class Ex1 {
    //Phương trình ax + b = 0
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) System.out.println("Phương trình có vô số nghiệm!");
        else if (a == 0 && b != 0) System.out.println("Phương trình vô nghiệm!");
        else {
            float x = -(float) b / a;
            System.out.println("Nghiệm của phương trình: " + x);
        }
        scanner.close();
    }
}
