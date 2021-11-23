import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean IsPrime = true;

        System.out.println("Input your number right here: ");
        number = scanner.nextInt();

        if (number < 2) {
            System.out.println("This number is not prime");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    IsPrime = false;
                    break;
                }
            }
            System.out.println(IsPrime);
            if (IsPrime) {
                System.out.println("This number " + number + " is prime");

            } else {
                System.out.println("This number " + number + " is not prime");
            }
        }
    }
}
