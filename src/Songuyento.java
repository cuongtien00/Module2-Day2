import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so de kiem tra");
        number = scanner.nextInt();
        boolean check = true;
        if (number<2){
            System.out.println(number + " is not a prime");
        }
        else {
            int i = 2;
            while(i<=Math.sqrt(number)){
                if(number%i==0) {
                    check = false;
                }
                i++;
            }
            if(check) {
                System.out.println(number + " is a prime");
            }
            else{
                System.out.println(number + " is not a prime");
            }
        }


    }
}
