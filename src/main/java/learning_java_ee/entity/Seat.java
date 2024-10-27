package learning_java_ee.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private SeatMaterial seatMaterial;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car", insertable = false, updatable = false)
    private Car car;


    public Seat() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SeatMaterial getSeatMaterial() {
        return seatMaterial;
    }

    public void setSeatMaterial(SeatMaterial seatMaterial) {
        this.seatMaterial = seatMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return id == seat.id && seatMaterial == seat.seatMaterial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seatMaterial);
    }
}

