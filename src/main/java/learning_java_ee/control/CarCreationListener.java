package learning_java_ee.control;

import jakarta.enterprise.event.Observes;
import learning_java_ee.entity.CarCreated;



public class CarCreationListener {

    public void onCreationListener(@Observes CarCreated carCreated) {

        System.out.println("new car created with id " + carCreated.getIdentifier());

    }
}
