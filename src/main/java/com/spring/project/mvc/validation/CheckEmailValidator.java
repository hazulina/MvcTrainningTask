package com.spring.project.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail,String> {
    private String endOfString;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.endsWith(endOfString);
    }

    @Override
    public void initialize(CheckEmail constraintAnnotation) {
        endOfString= constraintAnnotation.value();
    }
}
