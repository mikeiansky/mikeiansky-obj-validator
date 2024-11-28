package com.ian.mike.validator.constraints;

import com.ian.mike.validator.DateFormatValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * @author mike ian
 * @date 2024/9/13
 * @desc
 **/
@Documented
@Constraint(validatedBy = DateFormatValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateFormat {

    String message() default "错误的日期格式";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String format();
}
