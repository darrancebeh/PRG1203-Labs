public class Account {
    private double balance;
    private static double total = 0;
    
    public Account() {
        this.balance = 0.0;
    }

    public Account(double balance) {
        this.balance = balance;
        increaseTotal(balance);
    }

    public void credit(double amount) {
        balance += amount;
        increaseTotal(amount);
    }

    public void debit(double amount) {
        if(amount > balance) {
            System.out.println("Amount withdrawn exceeds the current balance.");
        } else {
            balance -= amount;
            decreaseTotal(amount);;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static double getTotal() {
        return total;
    }

    public static void increaseTotal(double amount) {
        total += amount;
    }

    public static void decreaseTotal(double amount) {
        total -= amount;
    }
}
