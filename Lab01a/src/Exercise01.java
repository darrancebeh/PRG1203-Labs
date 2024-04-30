import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first integer: ");
            int n1 = scanner.nextInt();

            System.out.println("Enter second integer: ");
            int n2 = scanner.nextInt();

            System.out.println("Enter third integer");
            int n3 = scanner.nextInt();

            System.out.printf("For the numbers %d, %d, and %d\n", n1, n2, n3);
            int largest = Math.max(n1, Math.max(n2, n3));
            int smallest = Math.min(n1, Math.min(n2, n3));
            int sum = n1 + n2 + n3;
            int product = n1 * n2 * n3;
            double avg = sum/3.0;

            System.out.printf("Largest is %d\n", largest);
            System.out.printf("Smallest is %d\n", smallest);
            System.out.printf("Sum is %d\n", sum);
            System.out.printf("Product is %d\n", product);
            System.out.printf("Average is %.2f\n", avg);
        }
    }
}
