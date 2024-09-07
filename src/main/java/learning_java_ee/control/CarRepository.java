package learning_java_ee.control;

import learning_java_ee.entity.Car;

import java.util.List;

public class CarRepository {

    public void store(Car car) {
    }

    public List<Car> loadCars() {
        // load cars
        return List.of(new Car());
    }
}
