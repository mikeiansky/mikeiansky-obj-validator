package com.ian.mike.validator.constraints;

import com.ian.mike.validator.CollSizeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mike ian
 * @date 2024/9/13
 * @desc
 **/
@Constraint(validatedBy = CollSizeValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CollSize {

    int min() default 0;

    int max() default 100;

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
