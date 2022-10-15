public class FactoryPatternLesson {


    public static void main(String[] args) throws Exception {
        Car bmwCar = CarFactory.create("bmw");
        Car mercedes = CarFactory.create("mercedes");
        Car audi = CarFactory.create("audi");

        bmwCar.drive();
        mercedes.drive();
        audi.drive();

    }

}
