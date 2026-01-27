package Lab4_OOP;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhập tên sản phẩm: ");
        this.name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        this.price = sc.nextDouble();
        System.out.println("Nhập thuế sản phẩm: ");
        this.tax = sc.nextDouble();

        sc.nextLine();// Để bỏ qua dấu Enter khi nhập số trước đó
    }

    public void xuatThongTin() {
        System.out.println("Thông tin sản phẩm: ");
        System.out.println("Tên :" + this.name);
        System.out.println("Giá :" + this.price);
        System.out.println("Thuế :" + this.tax);
    }

    public double getTaxPrice() {
        return price * tax;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        Product pr1 = new Product();
        Product pr2 = new Product("KeyBoard", 10, 0.2);

        System.out.println("Thông tin sản phẩm 1: ");
        pr1.nhapThongTin(sc);
        pr1.xuatThongTin();
        System.out.println("Giá thuế: " + pr1.getTaxPrice());

        System.out.println("Thông tin sản phẩm 2: ");
        pr2.xuatThongTin();
        System.out.println("Giá thuế: " + pr2.getTaxPrice());

    }
}
