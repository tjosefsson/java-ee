package learning_java_ee.control;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class CarCreationException extends RuntimeException {

    public CarCreationException(String message) {
        super(message);
    }

}
