public class displayPrime2 {
    public static void main(String[] args) {
        int number = 0 ;
        int count = 0;
        while(count<100) {
            if (check(number)) {
                System.out.println(number);
                count ++;
            }
            number++;
        }
    }
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        } else if (number < 4) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
