import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double totalProduct1 = 0;
            double totalProduct2 = 0;
            double totalProduct3 = 0;
            while(true) {
                System.out.print("Enter product number (1-3) (0 to stop): ");
                int product = scanner.nextInt();
                
                if (product == 0) {
                    break;
                }

                System.out.print("Enter quantity sold: ");
                int quantity = scanner.nextInt();

                switch(product) {
                    case 1:
                        totalProduct1 += quantity * 2.98;
                        break;
                    case 2:
                        totalProduct2 += quantity * 4.50;
                        break;
                    case 3:
                        totalProduct3 += quantity * 9.98;
                        break;
                    default:
                        System.out.println("Invalid product number.");
                        break;
                }
            }
            System.out.printf("\nProduct 1: $%.2f%nProduct 2: $%.2f%nProduct 3: $%.2f", totalProduct1, totalProduct2, totalProduct3);
        }
    }
}
