package DecoratorPattern;

public class LuxuryCar extends CarDecorator {

    LuxuryCar(CarDecorator carDecorator){
        super(carDecorator);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Luxury Car");
    }
}
