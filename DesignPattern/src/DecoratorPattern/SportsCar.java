package DecoratorPattern;

public class SportsCar extends CarDecorator{

    public SportsCar(Car carDecorator) {
        super(carDecorator);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("sportsCar");
    }
}
