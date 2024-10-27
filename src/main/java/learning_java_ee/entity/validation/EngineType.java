package learning_java_ee.entity.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = EngineTypeValidator.class)
@Documented
public @interface EngineType {

    String message() default "Engine type does not exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
