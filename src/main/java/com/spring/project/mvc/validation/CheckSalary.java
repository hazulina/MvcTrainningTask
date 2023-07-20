package com.spring.project.mvc.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckSalaryValidator.class)
public @interface CheckSalary {

    String message() default "salary must be positive";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
