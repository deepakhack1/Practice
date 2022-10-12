package DecoratorPattern;

public class Main {

    public static void main(String[] args) {

        Car c = new LuxuryCar(new SportsCar(new BasicCar()));
        c.assemble();

    }
}
