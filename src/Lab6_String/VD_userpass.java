package Lab6_String;

import java.util.Scanner;

public class VD_userpass {
    static void main() {
        Scanner sc = new Scanner(System.in);

        boolean check = false;
        do {
            System.out.print("Nhập username: ");
            String username = sc.nextLine().trim();
            System.out.print("Nhập password: ");
            String password = sc.nextLine().trim();
            if (username.equalsIgnoreCase("tiendung") && password.length() > 6) {
                System.out.println("Hợp lệ");
                check = true;
            } else {
                System.out.println("Không hợp lệ");
                check = false;
            }
        } while (!check);
        sc.close();
    }
}
