package com.smart_school.smart_school_management.exceptions;

import com.smart_school.smart_school_management.exceptions.ExceptioonEnums.ErrorType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiErrorResponse  {

    private int errorCode;
    private String errorStatus;
    private String errorMessage;
    private ErrorType errorType;
}
