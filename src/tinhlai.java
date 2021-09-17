import java.util.Scanner;

public class tinhlai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien gui tiet kiem");
        double firstMoney = scanner.nextDouble();
        System.out.println("Moi ban nhap lai suat hang nam");
         double rate = scanner.nextDouble();
        System.out.println("Moi ban nhap ky han (thang)");
         int time = scanner.nextInt();
        double lastMoney = 0;
        for (int i = 0; i < time; i++) {
            lastMoney += firstMoney*(rate/100*12)*time;
        }
        System.out.println("Tien la cua ban la " + lastMoney );
    }
}
