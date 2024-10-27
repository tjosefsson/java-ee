package learning_java_ee.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Enumerated(EnumType.STRING)
    private EngineType engineType;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "car", nullable = false)
    private List<Seat> seats = new ArrayList<>();

    public long getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "identifier='" + id + '\'' +
                ", color=" + color +
                ", engineType=" + engineType +
                '}';
    }

    public static class Builder {
        Car car;

        public Builder() {
            car = new Car();
        }

        public Builder withId(long id) {
            car.id = id;
            return this;
        }

        public Builder withColor(Color color) {
            car.color = color;
            return this;
        }

        public Builder withEngineType(EngineType engineType) {
            car.engineType = engineType;
            return this;
        }

        public Builder withSeats(List<Seat> seats) {
            car.seats.addAll(seats);
            return this;
        }

        public Car build() {
            return car;
        }

    }
}



