package Lab1.EX;

import java.util.Scanner;

public class Bai02 {
    static void main() {
        System.out.println("Run bài 02");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        int chieuDai = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int chieuRong = scanner.nextInt();

        int P = (chieuRong + chieuDai) * 2;
        System.out.println("Chu vi hình chữ nhật = " + P);

        int S = chieuDai * chieuRong;
        System.out.println("Diện tích hình chữ nhật = " + S);

        System.out.println("Cạnh nhỏ nhất : " + Math.min(chieuDai, chieuRong));
        scanner.close();
    }
}
