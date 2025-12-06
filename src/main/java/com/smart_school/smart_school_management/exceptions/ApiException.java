package com.smart_school.smart_school_management.exceptions;

import com.smart_school.smart_school_management.exceptions.ExceptioonEnums.ValidationErrors;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {
    
    private final ValidationErrors validationError;

    public ApiException(ValidationErrors validationError) {
        super(validationError.getErrorMessage());
        this.validationError = validationError;
    }

    public ApiException(ValidationErrors validationError, Throwable cause) {
        super(validationError.getErrorMessage(), cause);
        this.validationError = validationError;
    }
}
