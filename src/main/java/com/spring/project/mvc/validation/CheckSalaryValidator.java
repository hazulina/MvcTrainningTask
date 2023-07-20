package com.spring.project.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckSalaryValidator implements ConstraintValidator<CheckSalary, Integer> {


    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer > 0;
    }

    @Override
    public void initialize(CheckSalary constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
