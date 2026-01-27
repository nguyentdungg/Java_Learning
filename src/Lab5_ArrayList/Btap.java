package Lab5_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Btap {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n số thực: ");
        int n = sc.nextInt();

        ArrayList<Double> numbers = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            numbers.add(x);
        }
        System.out.println("Danh sách vừa nhập : " + numbers);
        double sum = 0;
        for (Double num : numbers) {
            sum += num;
        }
        System.out.println("Tổng: " + sum);

        sc.close();
    }
}
