package com.smart_school.smart_school_management.exceptions.ExceptioonEnums;

import lombok.Getter;

@Getter
public enum ValidationErrors {

    MOBILE_FIELD_MISSING(422,"mfm001",FieldErrorMessages.MOBILE_FIELD_MISSING,ErrorType.MISSING_MANDATORY_FIELD);

    public final int errorCode;
    public final String errorStatus;
    public final String errorMessage;
    public final ErrorType errorType;

    ValidationErrors(int errorCode, String errorStatus, String errorMessage, ErrorType errorType) {
        this.errorCode = errorCode;
        this.errorStatus = errorStatus;
        this.errorMessage = errorMessage;
        this.errorType = errorType;
    }


}
