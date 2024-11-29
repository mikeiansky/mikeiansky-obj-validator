package io.github.mikeiansky.validation;

import io.github.mikeiansky.validation.constraints.ValueOfInt;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;


public class ValueOfIntValidator implements ConstraintValidator<ValueOfInt, Integer> {

    private int[] allowedValues;

    @Override
    public void initialize(ValueOfInt annotation) {
        allowedValues = annotation.valueList();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        // 如果值为 null，则不做进一步验证，交由其他注解（如 @NotNull）处理
        if (value == null) {
            return true;
        }
        // 验证值是否在允许的列表中
        final int finalValue = value;
        return Arrays.stream(allowedValues).anyMatch(allowValue -> allowValue == finalValue);
    }

}
