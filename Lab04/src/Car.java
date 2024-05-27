public class Car {

    // Attributes (Replace with your desired car attributes)
    private String brand;
    private String colour;
    private int engineSize;
    private int speed;

    // Constructor 1 (Default constructor)
    public Car() {
        this.brand = "Unknown";
        this.colour = "Unknown";
        this.engineSize = 0;
        this.speed = 0;
    }

    // Constructor 2 (Constructor with parameters)
    public Car(String brand, String colour, int engineSize) {
        this.brand = brand;
        this.colour = colour;
        this.engineSize = engineSize;
        this.speed = 0;
    }

    public String toString() {
        return "The car with brand " + brand + ", colour " + colour + ", engine size " + engineSize + "cc is " + "running" + " at speed " + speed + "km/h.";
    }

    public void accelerate() {
        speed += 1;
    }

    public void decelerate() {
        speed -= 1;
    }

    public void stop() {
        speed = 0;
    }

    // Setters and Getters (Implement for each attribute)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}