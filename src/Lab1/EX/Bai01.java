package Lab1.EX;

import java.util.Scanner;

public class Bai01 {
    public static void main() {
        System.out.println("Run bài 01");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name is : ");
        String name = scanner.nextLine();

        System.out.println("GPA = ");
        String GPA = scanner.nextLine();

        System.out.println("Name is : " + name + " GPA = " + GPA);
    }
}
