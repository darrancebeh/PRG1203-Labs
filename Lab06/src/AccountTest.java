import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account(50.00);
        Account account2 = new Account(8.93);

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());

        
        System.out.print("\nEnter amount to be deposited into Account 1: ");
        double amount = scanner.nextDouble();
        account1.credit(amount);

        System.out.print("Enter amount to be deposited into Account 2: ");
        amount = scanner.nextDouble();
        account2.credit(amount);

        System.out.println("\nAccount 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance() + "\n");

        System.out.print("Enter amount to be withdrawn from Account 1: ");
        amount = scanner.nextDouble();
        account1.debit(amount);

        System.out.print("Enter amount to be withdrawn from Account 2: ");
        amount = scanner.nextDouble();
        account2.debit(amount);

        System.out.println("\nAccount 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance() + "\n");

        System.out.printf("\nTotal balance of all accounts: %.2f\n", Account.getTotal());    }
}
