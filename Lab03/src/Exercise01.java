import java.util.Scanner;

public class Exercise01 {

    static int sum (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            int sum = sum(num);

            System.out.println("The sum of the numbers from 1 to " + num + " is " + sum + ".");

            
        }
    }
}
