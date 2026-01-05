package Lab2;

import java.util.Scanner;

public class Tax {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiền thuế: (triệu đồng)");
        int tax = scanner.nextInt();

        if (tax < 10)
            System.out.println("Không đóng thuế!");
        else if (tax >= 10 && tax <= 15)
            System.out.println("Thuế 10%");
        else if (tax > 15 && tax <= 30)
            System.out.println("Thuế 20%");
        else if (tax > 30) {
            System.out.println("Thuế 50%");
        } else System.out.println("Nhập sai giá trị!");
        scanner.close();
    }
}
