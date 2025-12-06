package com.smart_school.smart_school_management.exceptions;

import com.smart_school.smart_school_management.exceptions.ExceptioonEnums.ErrorType;
import com.smart_school.smart_school_management.exceptions.ExceptioonEnums.ValidationErrors;
import com.smart_school.smart_school_management.exceptions.ExceptionTypes.MobileNumberException;
import jakarta.validation.ConstraintViolationException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MobileNumberException.class)
    public ResponseEntity<ErrorResponse> handleMobileNumberException(MobileNumberException ex) {
        ErrorResponse errorResponse = new ErrorResponse(
                422,
                "mne001",
                ex.getMessage(),
                ErrorType.MISSING_MANDATORY_FIELD
        );
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(errorResponse);
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ErrorResponse {
        private int errorCode;
        private String errorStatus;
        private String errorMessage;
        private ErrorType errorType;
    }
}
