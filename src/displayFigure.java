import java.util.Scanner;

public class displayFigure {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice!=0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.printf("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.printf("*");
                        }
                        System.out.println("");
                        }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j >i ; j--) {
                            System.out.printf(" ");
                        }
                        for (int j = 0 ; j <i ; j++) {
                            System.out.printf("*");
                            System.out.printf("*");
                        }
                        System.out.println("");
                        }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                }
            }
        }
    }

