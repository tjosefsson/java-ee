package learning_java_ee.control;

import learning_java_ee.entity.Car;
import learning_java_ee.entity.Color;
import learning_java_ee.entity.Specification;

import java.util.UUID;

public class CarFactory {

    Color defaultColor = null;

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor() == null ? defaultColor : specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}