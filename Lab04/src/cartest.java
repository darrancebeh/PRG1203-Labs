import java.util.ArrayList;

public class cartest {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Black", 3000);
        Car car2 = new Car("Perodua", "Red", 1400);
        Car car3 = new Car();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car2.setColour("Black");
        car3 = new Car("IKEA", "White", 1600);

        car1.toString();
        car2.toString();
        car3.toString();

        car1.setColour("Neon Pink");
        car1.setEngineSize(4000);

        car2.setColour("Eye-searing Neon Red");
        car2.setEngineSize(2400);

        car3.setColour("Soulless White");
        car3.setEngineSize(1600);

        System.out.printf("Updated Car1: Brand = %s, Colour = %s, Engine Size = %dcc\n", car1.getBrand(), car1.getColour(), car1.getEngineSize());
        System.out.printf("Updated Car2: Brand = %s, Colour = %s, Engine Size = %dcc\n", car2.getBrand(), car2.getColour(), car2.getEngineSize());
        System.out.printf("Updated Car3: Brand = %s, Colour = %s, Engine Size = %dcc\n", car3.getBrand(), car3.getColour(), car3.getEngineSize());
    
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();

        car2.accelerate();
        car2.accelerate();
        car2.decelerate();
        car2.accelerate();
        car2.decelerate();
        car2.decelerate();
        car2.accelerate();

        car3.accelerate();
        car3.accelerate();
        // I love physics
        car3.stop();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("\nCars in ArrayList:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}