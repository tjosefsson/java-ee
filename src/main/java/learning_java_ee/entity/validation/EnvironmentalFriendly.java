package learning_java_ee.entity.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({FIELD, METHOD, ANNOTATION_TYPE, PARAMETER})
@Constraint(validatedBy = EnvironmentalFriendlyValidator.class)
@Documented
public @interface EnvironmentalFriendly {

    String message() default "EnvironmentalFriendly validation";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
