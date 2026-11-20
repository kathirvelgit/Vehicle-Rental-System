public class Main {

    public static void main(String[] args) {

        // Upcasting
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        // Dynamic Method Dispatch
        System.out.println("Car Rent : " + v1.calculateRent());
        System.out.println("Bike Rent : " + v2.calculateRent());

        // Downcasting
        Car car = (Car) v1;
        car.showCarType();

        // String to int Conversion
        String amount = "2500";
        int rent = Integer.parseInt(amount);

        System.out.println("Converted Rent : " + rent);

        // Autoboxing
        int num = 100;
        Integer obj = num;

        System.out.println("Autoboxing : " + obj);

        // Auto-unboxing
        Integer obj2 = 200;
        int num2 = obj2;

        System.out.println("Auto-unboxing : " + num2);

        // Explicit Boxing
        int value = 300;
        Integer wrapper = Integer.valueOf(value);

        System.out.println("Explicit Boxing : " + wrapper);

        // Explicit Unboxing
        int result = wrapper.intValue();

        System.out.println("Explicit Unboxing : " + result);
    }
}