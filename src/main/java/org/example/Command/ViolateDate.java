package org.example.Command;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.validation.executable.ExecutableValidator;
import jakarta.validation.metadata.BeanDescriptor;
import org.example.Tariff.Tariff;

import java.util.Set;

public class ViolateDate {

    public void ViolateTariff(Tariff tar1) {

        Validator validator = new Validator() {
            @Override
            public <T> Set<ConstraintViolation<T>> validate(T t, Class<?>... classes) {
                return null;
            }

            @Override
            public <T> Set<ConstraintViolation<T>> validateProperty(T t, String s, Class<?>... classes) {
                return null;
            }

            @Override
            public <T> Set<ConstraintViolation<T>> validateValue(Class<T> aClass, String s, Object o, Class<?>... classes) {
                return null;
            }

            @Override
            public BeanDescriptor getConstraintsForClass(Class<?> aClass) {
                return null;
            }

            @Override
            public <T> T unwrap(Class<T> aClass) {
                return null;
            }

            @Override
            public ExecutableValidator forExecutables() {
                return null;
            }
        };

        Set<ConstraintViolation<Tariff>> violations = validator.validate(tar1);
    }
}
