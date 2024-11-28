package com.ian.mike.validator.constraints;

import com.ian.mike.validator.ValueOfIntValidator;
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
@Constraint(validatedBy = ValueOfIntValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValueOfInt {

    int[] valueList();
    String message() default "值必须在指定的范围内";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
