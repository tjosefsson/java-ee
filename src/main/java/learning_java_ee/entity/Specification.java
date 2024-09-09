package learning_java_ee.entity;

import jakarta.json.bind.annotation.JsonbProperty;

public class Specification  {

    @JsonbProperty
    private Color color;
    @JsonbProperty
    private EngineType engineType;


    public Specification() {
    }

    public Specification(Color color, EngineType engineType) {
        this.color = color;
        this.engineType = engineType;
    }

    public Color getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
