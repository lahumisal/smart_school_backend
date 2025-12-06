package com.smart_school.smart_school_management.exceptions;

import com.smart_school.smart_school_management.exceptions.ExceptioonEnums.ValidationErrors;
import com.smart_school.smart_school_management.exceptions.ExceptionTypes.MobileNumberException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MobileNumberException.class)
    public ResponseEntity<ApiErrorResponse> handleMobileNumberException(MobileNumberException ex) {

        ValidationErrors ve = ex.getError(); // from the exception

        ApiErrorResponse response = new ApiErrorResponse(
                ve.getErrorCode(),
                ve.getErrorStatus(),
                ve.getErrorMessage(),
                ve.getErrorType()
        );
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }


}
