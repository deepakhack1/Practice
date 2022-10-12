package DecoratorPattern;

public class CarDecorator implements Car {

    Car c;

    public CarDecorator(Car carDecorator) {
        this.c = carDecorator;   // c - > basic car(sports car) . sportcar(luxury car)
    }

    @Override
    public void assemble() {
        this.c.assemble();
    }
}
