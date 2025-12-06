package com.smart_school.smart_school_management.exceptions.ExceptionTypes;

import com.smart_school.smart_school_management.exceptions.ExceptioonEnums.ValidationErrors;

public class MobileNumberException extends RuntimeException{

    private final ValidationErrors error;

    public MobileNumberException(ValidationErrors error) {
        super(error.getErrorMessage());
        this.error = error;
    }

    public ValidationErrors getError() {
        return error;
    }

}
