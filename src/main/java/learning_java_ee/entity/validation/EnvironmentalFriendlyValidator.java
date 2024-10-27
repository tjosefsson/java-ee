package learning_java_ee.entity.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import learning_java_ee.entity.EngineType;

public class EnvironmentalFriendlyValidator implements ConstraintValidator<EnvironmentalFriendly, EngineType> {

    @Override
    public void initialize(EnvironmentalFriendly constraintAnnotation) {
    }

    @Override
    public boolean isValid(EngineType engineType, ConstraintValidatorContext constraintValidatorContext) {
        return engineType == EngineType.ELECTRIC;
    }

}
