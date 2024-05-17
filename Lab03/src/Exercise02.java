import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

    static void divideByZero(int n) {
        try {
            n = n / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void addElement(int[] arr, int element) {
        try {
            arr[5] = element;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 1;
            int i = 0;
            int[] numList = new int[5];
            int num = 0;

            while (n <= 5) {
                System.out.println("\nCurrent array: " + Arrays.toString(numList));
                try {
                    System.out.printf("Enter 5 integers, (n = %d): ", n);
                    num = scanner.nextInt();
            
                } catch (Exception e) {
                    System.out.println("Invalid input. Try again.");
                    scanner.nextLine();
                    continue;
                }

                numList[i] = num;
                i++;
                n++;
            }
            
            System.out.printf("\nAttempting to divide %d by zero...\n", numList[0]);
            try {
                divideByZero(numList[0]);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            
            }

            System.out.printf("\nAttempting to add a 6th element into the array...\n");
            int element = 6;
            try {
                addElement(numList, element);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}