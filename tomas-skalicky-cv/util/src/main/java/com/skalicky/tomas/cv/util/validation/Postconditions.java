package com.skalicky.tomas.cv.util.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
 * Simple static methods to be called directly <b>after</b> the creation, modification or retrieving of
 * objects to verify their correct state. If the verification finds a violation of any constraint, a
 * {@link IllegalArgumentException} is thrown.
 *
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public final class Postconditions {

    private Postconditions() {
    }

    /**
     * Triggers a JSR-303 validation process of the given bean.
     *
     * @param beanToBeValidated
     *            Object of type {@code T} which is to be validated.
     * @param validatorFactory
     * @throws IllegalArgumentException
     *             if {@code beanToBeValidated} is not valid. Error message is a concatenation of messages of
     *             all constraint violations.
     */
    public static <T> void isValid(T beanToBeValidated, Validator validator) {
        Set<ConstraintViolation<T>> violations = validator.validate(beanToBeValidated);

        if (!violations.isEmpty()) {
            StringBuilder errorMessage = new StringBuilder();
            for (ConstraintViolation<T> violation : violations) {
                errorMessage.append(String.format("%s: \"%s\" ... %s\n", violation.getPropertyPath(),
                        violation.getInvalidValue(), violation.getMessage()));
            }
            throw new IllegalArgumentException(errorMessage.toString());
        }
    }
}
