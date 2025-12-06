package com.smart_school.smart_school_management.model.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MobileNumberValidator implements ConstraintValidator<MobileNumber, String> {

    @Override
    public boolean isValid(String mobile, ConstraintValidatorContext context) {
        if (mobile == null || mobile.isBlank())
            return false;

        return mobile.matches("^[0-9]{10}$");
    }
}
