public class TV {
    private String stockNumber;
    private String make;
    private char screenType;
    private double price;

    public TV() {
        this.stockNumber = "Unknown";
        this.make = "Unknown";
        this.screenType = 'U';
        this.price = 0.0;
    }

    public TV(String stockNumber, String make, char screenType, double price) {
        this.stockNumber = stockNumber;
        this.make = make;
        this.screenType = screenType;
        this.price = price;
    }

    public String toString() {
        return "Stock Number: " + stockNumber + "\nMake: " + make + "\nScreen Type: " + screenType + "\nPrice: " + price;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setScreenType(char screenType) {
        this.screenType = screenType;
    }

    public char getScreenType() {
        return screenType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getTax(double taxRate) {
        return price * (taxRate/100);
    }
}
