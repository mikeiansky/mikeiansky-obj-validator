package com.ian.mike.validator;
import com.ian.mike.validator.constraints.DateFormat;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.format.DateTimeFormatter;

/**
 * @author mike ian
 * @date 2024/9/13
 * @desc
 **/
public class DateFormatValidator implements ConstraintValidator<DateFormat, String> {

    private String format;

    @Override
    public void initialize(DateFormat annotation) {
        this.format = annotation.format();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 如果值为 null，则不做进一步验证，交由其他注解（如 @NotNull）处理
        if (value == null) {
            return true;
        }

        try {
            // 尝试解析日期
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            formatter.parse(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
