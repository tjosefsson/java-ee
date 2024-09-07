package learning_java_ee.control;

import learning_java_ee.entity.Color;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class DefaultColorExposer {

    @Produces
    @Diesel
    public Color exposeDefaultColor() {
        //..
        return Color.RED;

    }
}
