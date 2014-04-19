package com.skalicky.tomas.cv.util.validation;

import javax.validation.Validation;
import javax.validation.Validator;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public final class ValidatorFactory {

    private static final javax.validation.ValidatorFactory VALIDATOR_FACTORY = Validation
            .buildDefaultValidatorFactory();

    private ValidatorFactory() {
    }

    public static Validator getValidator() {
        return VALIDATOR_FACTORY.getValidator();
    }
}
