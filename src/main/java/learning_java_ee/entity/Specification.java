package learning_java_ee.entity;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Specification implements Serializable {

    @NotNull
    private Color color;
    @NotNull
//    @EnvironmentalFriendly
    private EngineType engineType;
    private List<Seat> seats = new ArrayList<>();


    public Specification() {
    }

    public Color getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setColor(@NotNull Color color) {
        this.color = color;
    }

    public void setEngineType(@NotNull EngineType engineType) {
        this.engineType = engineType;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
