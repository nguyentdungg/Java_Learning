import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        //Kiểm tra chia hết cho 2
        if(n % 2 == 0){
            System.out.println(n+" là số chẵn.");
        }else{
            System.out.println(n+" là số lẻ.");
        }
    }
}