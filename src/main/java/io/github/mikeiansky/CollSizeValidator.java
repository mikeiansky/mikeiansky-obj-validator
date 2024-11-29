package io.github.mikeiansky;

import io.github.mikeiansky.constraints.CollSize;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Collection;


public class CollSizeValidator implements ConstraintValidator<CollSize, Collection<?>> {

    private int min;
    private int max;

    @Override
    public void initialize(CollSize annotation) {
        min = annotation.min();
        max = annotation.max();
    }

    @Override
    public boolean isValid(Collection value, ConstraintValidatorContext context) {
        // 如果值为 null，则不做进一步验证，交由其他注解（如 @NotNull）处理
        if (value == null) {
            return true;
        }
        int size = value.size();
        return size >= min && size <= max;
    }

}
