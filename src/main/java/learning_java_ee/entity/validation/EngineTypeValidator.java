package learning_java_ee.entity.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class EngineTypeValidator implements ConstraintValidator<EngineType, learning_java_ee.entity.EngineType> {

    @Override
    public boolean isValid(learning_java_ee.entity.EngineType engineType, ConstraintValidatorContext constraintValidatorContext) {
        return learning_java_ee.entity.EngineType.isEngine(engineType);
    }

    @Override
    public void initialize(EngineType constraintAnnotation) {
    }
}
