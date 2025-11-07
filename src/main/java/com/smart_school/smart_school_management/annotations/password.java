package com.smart_school.smart_school_management.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR, ElementType.PARAMETER})
public @interface password {

}
