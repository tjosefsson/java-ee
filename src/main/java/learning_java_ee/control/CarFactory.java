package learning_java_ee.control;

import learning_java_ee.entity.Car;
import learning_java_ee.entity.Specification;


public class CarFactory {

    public Car createCar(Specification specification) {
        return new Car.Builder()
                .withColor(specification.getColor())
                .withEngineType(specification.getEngineType())
                .withSeats(specification.getSeats())
                .build();
    }
}