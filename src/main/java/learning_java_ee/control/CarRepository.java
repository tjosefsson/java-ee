package learning_java_ee.control;

import learning_java_ee.entity.Car;
import learning_java_ee.entity.Color;
import learning_java_ee.entity.EngineType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CarRepository {

    public void store(Car car) {
    }

    public List<Car> loadCars() {
        // load cars
        return getCars();
    }

    public Optional<Car> loadCar(String id) {
        return getCars().stream()
                .filter(c -> c.getIdentifier().equals(id))
                .findFirst();
    }


    private List<Car> getCars() {
        var car1 = new Car();
        car1.setIdentifier("1");
        car1.setColor(Color.BLACK);
        car1.setEngineType(EngineType.DIESEL);

        var car2 = new Car();
        car2.setIdentifier("2");
        car2.setColor(Color.GREY);
        car2.setEngineType(EngineType.PETROl);

        var car3 = new Car();
        car3.setIdentifier("3");
        car3.setColor(Color.RED);
        car3.setEngineType(EngineType.ELECTRIC);

        return List.of(car1, car2, car3);
    }
}
