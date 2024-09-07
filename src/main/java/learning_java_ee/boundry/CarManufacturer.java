package learning_java_ee.boundry;


import learning_java_ee.control.CarFactory;
import learning_java_ee.control.CarRepository;
import learning_java_ee.entity.Car;
import learning_java_ee.entity.Specification;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class CarManufacturer {

    @Inject
    CarFactory carFactory;
    @Inject
    CarRepository carRepository;
//    @Inject
//    Event<CarCreated> carCreated;

    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        carRepository.store(car);

//        carCreated.fire(new CarCreated(car.getIdentifier()));

        return car;
    }

    public List<Car> retrieveCar() {
        return carRepository.loadCars();
    }

}
