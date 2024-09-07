package learning_java_ee.control;

import jakarta.ws.rs.Produces;
import learning_java_ee.entity.Color;

public class DefaultColorExposer {

    @Produces
    @Diesel
    public Color exposeDefaultColor() {
        //..
        return Color.RED;

    }
}
