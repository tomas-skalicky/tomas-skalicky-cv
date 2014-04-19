package com.skalicky.tomas.cv.domain;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public enum CompetencyLevel {

    JUNIOR("junior"), JUNIOR_SENIOR("juniorSenior"), SENIOR("senior");

    private static final String LOCALIZATION_KEY_PREFIX = "competency.level.";

    @NotBlank
    private final String localizationKeySuffix;

    private CompetencyLevel(String localizationKeySuffix) {
        this.localizationKeySuffix = localizationKeySuffix;
    }

    public String getLocalizationKey() {
        return LOCALIZATION_KEY_PREFIX + localizationKeySuffix;
    }
}
