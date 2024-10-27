package learning_java_ee.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class SeatBelt {

    @Enumerated(EnumType.STRING)
    private seatBeltModel model;

    public void open() {

    }

    public void close() {

    }
}
