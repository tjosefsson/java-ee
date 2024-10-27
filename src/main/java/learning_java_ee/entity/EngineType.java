package learning_java_ee.entity;

import java.util.Arrays;

public enum EngineType {
    DIESEL, PETROL, ELECTRIC;

    public static boolean isEngine(EngineType engine) {
        return Arrays.asList(EngineType.values()).contains(engine);
    }
}
