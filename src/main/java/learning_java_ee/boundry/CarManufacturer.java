package learning_java_ee.boundry;


import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import learning_java_ee.control.CarFactory;
import learning_java_ee.entity.Car;
import learning_java_ee.entity.Specification;


import java.util.List;

@Stateless
public class CarManufacturer {

    @Inject
    CarFactory carFactory;
    @PersistenceContext
    EntityManager em;


    public Car manufactureCar(Specification specification) {
        var car = carFactory.createCar(specification);
        em.persist(car);
        return car;
    }

    public List<Car> retrieveCars() {
        return em.createQuery("SELECT c from Car c", Car.class).getResultList();
    }

}
