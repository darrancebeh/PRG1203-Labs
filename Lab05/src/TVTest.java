import java.util.Scanner;

public class TVTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv1 = new TV("S101", "Elba", 'R', 1400);

        System.out.println(tv1.toString());

        System.out.print("\nEnter new price of TV: ");
        double newPrice = scanner.nextDouble();

        tv1.setPrice(newPrice);

        System.out.println("\nUpdated TV Attributes: ");
        System.out.println(tv1.toString());
    }
}
