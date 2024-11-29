package io.github.mikeiansky.constraints;

import io.github.mikeiansky.DateFormatValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * @author mike ian
 * @date 2024/9/13
 * @desc 日期格式验证
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
