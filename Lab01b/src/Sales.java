import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double totalProduct1 = 0;
            double totalProduct2 = 0;
            double totalProduct3 = 0;
            while(true) {
                System.out.println("Enter product number (1-3) (0 to stop): ");
                int product = scanner.nextInt();
                
                if (product == 0) {
                    break;
                }

                System.out.println("Enter quantity sold: ");
                int quantity = scanner.nextInt();

                 if(product == 1) {
                    totalProduct1 += quantity * 2.98;
                 }
                 else if (product == 2) {
                    totalProduct2 += quantity * 4.50;
                 }
                 else if (product == 3) {
                    totalProduct3 += quantity * 9.98;
                 }
                 else {
                    System.out.println("Invalid product number.");
                 }

            }
            System.out.printf("Product 1: $%.2f%nProduct 2: $%.2f%nProduct 3: $%.2f", totalProduct1, totalProduct2, totalProduct3);
        }
    }
}
